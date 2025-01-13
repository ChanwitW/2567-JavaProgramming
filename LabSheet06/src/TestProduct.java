
public class TestProduct {

	public static void main(String[] args) {
		// Create two product object
		Product pd1 = new Product();
		
		//set product detail
		pd1.setProductDetails("Smartphone", 30000.0, 7.0);
		
		//Display product detail
		System.out.println("Product Details : ");
		pd1.displayProductDetails();

	}

}
