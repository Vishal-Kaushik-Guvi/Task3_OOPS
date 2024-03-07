package Question2;

public class Employee implements Taxable {
// Data Members of Employee Class
 private int empId;
 private String empName;
 private Double empSalary;

// Consturctor of Employee Class
    public Employee(int empId, String empName, Double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

// Abstract Method of Taxable class to calculate 10.5% tax from yearly salary.
    @Override
    public double calcTax(double amount) {
        return amount*incomeTax;
    }

    
}
