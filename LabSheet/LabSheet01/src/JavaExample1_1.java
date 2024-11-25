import java.util.Scanner;
public class JavaExample1_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.print("Enter your first name (using next) : ");
		String firstname = input.next();
		input.nextLine();
		
		System.out.print("Enter lsat name(using nextline) : ");
		String lastname = input.nextLine();
		
		System.out.println("\n-----Output-----");
		System.out.println("First name : "+ firstname);
		System.out.println("Last  name : "+ lastname);
		
		input.close();
		

	}

}
