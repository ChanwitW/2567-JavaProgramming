import java.util.Iterator;

public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		
		//customer's toString()
		System.out.println(c1);
		
		//set customer's discount in 5
		c1.setDiscount(5);
		
		//customer's toString()
		System.out.println(c1);
		
		Line();
		
		//Show customer's id
		System.out.println("ID is : " + c1.getCustID());
		//Show customer's name
		System.out.println("name is : " + c1.getCustName());
		//Show customer's discount
		System.out.println("Discount is : " + c1.getDiscount());
		
		System.out.println("###Test Invoice class###");
		Invoice inv1 = new Invoice(101, c1, 12000.00);
		// Invoice's toString()
		System.out.println(inv1);		
		// set invoice's amount is 10000
		inv1.setAmount(10000);		
		// Invoice's toString()
		System.out.println(inv1);
		
		Line();
		
		// show invoice's id
		System.out.println("Invoice id is : " + inv1.getInvId());
		// Customer's toString() by instance inv1
		System.out.println("Customer is : " + inv1.getCustomer());
		// show invoice's amount
		System.out.println("Amount is : " +inv1.getAmount());
		
		Line();
		
		// show customer's id by instance inv1
		System.out.println("Customer's id is : " + inv1.getCustomerID());
		// show customer's name by instance inv1
		System.out.println("Customer's name is : " + inv1.getCustomerName());
		// show customer's discount by instance inv1
		System.out.println("Customer's discount is : " + inv1.getCustomerDiscount());
		// show invoice's amount after discount(format as output)
		System.out.printf("Amount after discount is : %.2f " , inv1.getAmountAfterDiscount());

	}
	
	public static void Line() {
		for (int i = 0; i < 30; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
