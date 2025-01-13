import java.util.*;
public class TestProductInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Create product object
		Product pd1 = new Product();
		
		//Input for product
		System.out.print("Enter Product name : ");
		String pdName = scan.next();
		System.out.print("Enter Product price : ");
		double pdPrice = scan.nextDouble();
		System.out.print("Enter Vat rate (%) : ");
		double pVatRate = scan.nextDouble();
		
		//Set Product details
		pd1.setProductDetails(pdName, pdPrice, pVatRate);
		
		//display Product details 
		System.out.println("\nProduct Details:");
		pd1.displayProductDetails();

	}

}
