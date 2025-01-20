
public class LoanCalculator {
	//attribute
	private String name;
	private double price;
	private double interestRates;
	private int year;
	
	//Method set as LoanCalculator details
	public void setLoanDetails(String productName, double productPrice, double interestRate, int years) {
		name = productName;
		price = productPrice;
		interestRates = interestRate;
		year = years;
	}

	//Method to calculate Monthly Payment
	public double calculateMonthlyPayment() {
		double rate = (interestRates / 100) / 12; 
		int months = year * 12;
		
		double monthlyPayment = (price * rate * Math.pow(1+rate, months)) / (Math.pow(1+rate, months)-1);
		return monthlyPayment;
	}	

	//Method to display calculate Monthly Payment
	public void DisplayLoanDetails () {
		double monthlyPayment = calculateMonthlyPayment();
		System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Interest Rate: " + interestRates + "%");
        System.out.println("Years: " + year + " years");
        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
	}
}
