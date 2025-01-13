
public class Product {
	//attribute
	private String names;
	private double prices;
	private double vatRates;
	
	//Method to set Product details
	public void setProductDetails(String name, double price, double vatRate) {
		names = name;
		prices = price;
		vatRates = vatRate;
	}
	
	//Method to calculate productPrice
	public double calculateTotalPrice() {
		double totalPrice = prices * vatRates/100;
		totalPrice += prices;
		return totalPrice;
	}
	
	//Method to display Product detail
	public void displayProductDetails() {
		System.out.println("Product Name: " + names);
		System.out.println("Price (Befor VAT): " + prices);
		System.out.println("Price (After VAT): " + calculateTotalPrice());
	}

}
