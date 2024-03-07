package Question2;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

// Taking Employee Information in Scanner.
    System.out.print("Enter employee name: ");
    String empName = sc.nextLine();
    
    System.out.print("Enter employee ID: ");
    int empID = sc.nextInt();
    
    System.out.print("Enter employee salary: Rs.");
    double empSalary = sc.nextDouble();

// Object of Employee class
    Employee emp = new Employee(empID, empName, empSalary);

// Desplaying Employee Information.
    System.out.println("Employee Name: " + empName);
    System.out.println("Employee ID: " + empID);
    System.out.println("Employee Salary: Rs." + empSalary);
    System.out.println("Yearly Tax: Rs." + emp.calcTax(empSalary));

// ---------------------For Products----------------------------------

// Taking product information in scanner.
    System.out.print("Enter product ID: ");
    int pid = sc.nextInt();
    
    System.out.print("Enter price per unit: ");
    double price = sc.nextDouble();
    
    System.out.print("Enter quantity: ");
    int quantity = sc.nextInt();
    
// object of Product Class.
    Product product = new Product(pid, price, quantity);

// Displaying information of product
    System.out.println("Product ID: " + pid);
    System.out.println("Price per unit: Rs." + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("Sales Tax per unit: Rs." + product.calcTax(price));
    
    sc.close();
    }
}
