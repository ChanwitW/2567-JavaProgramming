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
		System.out.print("Total Price is : "+ totalPrice+" baht. ");
		System.out.println("-------------------------------------");

	}

}
