
public class TestRectangle {

	public static void main(String[] args) {
		// Test constructors and toString()
		Rectangle r1 = new Rectangle();    //call default constructors
		//System.out.println(r1.toString());
		System.out.println(r1);    // call to string method
		
		//call Parameterize constructors method
		Rectangle r2 = new Rectangle(1.2f , 3.4f);
		System.out.println(r2);// call to string method
		System.out.println();

		//test setters and getter 
		r1.setLenght(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);    // call to string method
		System.out.println("Lenght is " + r1.getLenght());
		System.out.println("Width is " + r1.getWidth());
		System.out.println();
		
		//test get area method and getPerimeter()
		System.out.printf("Area is %.2f%n", r1.getArea());
		System.out.printf("Perimeter is %.2f%n", r1.getPerimeter());
	}

}
