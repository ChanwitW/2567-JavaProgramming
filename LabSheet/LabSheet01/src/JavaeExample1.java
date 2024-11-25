import java.util.Scanner;
import java.text.*;
public class JavaeExample1 {

	public static void main(String[] args) {
		//defind object from scaner class
		Scanner scan = new Scanner (System.in);
		//defind object for manage format number by decimal format
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		
		System.out.print("Input product name : ");
		String productName = scan.nextLine();
		
		System.out.print("Input product unit : ");
		int productUnit = scan.nextInt();
		
		System.out.print("Input price per unit : ");
		float productPrice = scan.nextFloat();
		
		System.out.println();
		System.out.println("Product name is : "+ productName);
		
		float totalPriceProduct = productUnit * productPrice;
		System.out.println("Total Price is "+ frm.format(totalPriceProduct) + " baht. ");
		
		float totalVat = totalPriceProduct + (totalPriceProduct * 7/100);
		System.out.println("Add vat 7% is "+ frm.format(totalVat) + " baht. ");
		
		//output using string format and printf
		System.out.println("*****using printf and String.format*****");
	    System.out.printf("Product name is : %s", productName);
		System.out.printf("\nTotal price is %,.2f",totalPriceProduct);
		System.out.printf("\nAdd vat 7% is %s baht.",String.format("%,.2f",totalVat));
		
		scan.close();
	}

} 
