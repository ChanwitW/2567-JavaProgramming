import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab101 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);		
		
		System.out.print("Input product name : ");
		String productName = scan.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = scan.nextInt();
		System.out.print("Input price per unit : ");
		float productPrice = scan.nextFloat();
		
		System.out.println("-------------------------------------");
		float totalPrice = productUnit * productPrice ;
		System.out.println("Total Price is : "+ totalPrice+" baht. ");
		System.out.println("-------------------------------------");
		
		System.out.print("How many Discount (%) : ");
		int Vat = scan.nextInt(); 
		System.out.println("-------------------------------------");
		
		float discount = totalPrice*Vat/100;
		float paid = totalPrice-discount;
		System.out.println("Discount from "+Vat+ "%" +" "+discount+"baht.");
		System.out.println("Amount to be paid "+""+""+paid+"baht.");
		

	}

}
