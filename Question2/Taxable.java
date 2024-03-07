package Question2;

public interface Taxable {
// sales tax is 7% i.e 7/100 = .07
    double salesTax = .07;
// income tax is 10.5 i.e 10.5/100 = .105
    double incomeTax = .105;

// Abstract Method calculate taxes.
    public double calcTax(double amount);
}
