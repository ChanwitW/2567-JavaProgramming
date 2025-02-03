import java.security.PublicKey;
import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] productList = new Product[4];
		
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id : ");
			productList[i].setId(scan.nextLine());
			
			System.out.print("Input product Unit : ");
			productList[i].setUnit(scan.nextInt());
			
			System.out.print("Input product Price : ");
			productList[i].setPrice(scan.nextDouble());
			
			scan.nextLine();			
			System.out.println();
		}
		double totalPrice = 0;
		Line();
		for (Product product : productList) {
			double productValue = product.calculate();
			totalPrice += productValue;
			System.out.printf("Product Id : %s, Total price = %.2f baht.",product.getId() , productValue);
		}
		Line();
		System.out.printf("Total price of all product is : %.2f", totalPrice);
		
		scan.close();
	}
	
	public static void Line() {
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
