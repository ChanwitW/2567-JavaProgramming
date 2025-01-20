public class Lab605_IncomeTaxCalculator {
    //attribute
    private double incomeValue;

    //Method set as Income tax detail
    public void setIncome(double income) {
        incomeValue = income;
    }

    //Method calculate tax
    public double calculateTax() {
        double tax = 0.0;
        if (incomeValue > 500000) {
            tax += (incomeValue - 500000) * 0.20; 
            tax += (500000 - 300000) * 0.10;     
            tax += (300000 - 150000) * 0.05;     
        } 
        else if (incomeValue > 300000 || incomeValue < 500001) {
            tax += (incomeValue - 300000) * 0.10;
            tax += (300000 - 150000) * 0.05;     
        } 
        else if (incomeValue > 150000 || incomeValue < 300001) {
            tax += (incomeValue - 150000) * 0.05; 
        }


         return tax;
    }

    //Method calculate tax display 
    public void displayTaxDetails() {
        double tax = calculateTax();
        System.out.printf("Income: %.2f%n", incomeValue);
        System.out.printf("Tax: %.2f%n", tax);
    }


