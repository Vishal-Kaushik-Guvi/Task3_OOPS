package Question2;

public class Product implements Taxable {
// Data Member of Taxable class
  private  int pid; 
  private  double price;
  private  int quantity;

// Constructor of Taxable Class
  public Product(int pid, double price2, int quantity) {
    this.pid = pid;
    this.price = price2;
    this.quantity = quantity;
}

// Abstract method of Taxable class to calculate sales tax of 7% on per unit of product 
@Override
public double calcTax(double amount) {
    return amount*salesTax;
}
}
