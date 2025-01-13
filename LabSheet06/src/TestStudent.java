import java.util.Iterator;

public class TestStudent {

	public static void main(String[] args) {
		//Create twp student object
		Student std1 = new Student();
		Student std2 = new Student();
		
		//Set student details
		std1.setStudentDetails("Intouch", new double[] {85.0, 67.0, 78.5});
		std2.setStudentDetails("sukonlawat", new double[] {90.0, 59.8});
		
		//display student details
		System.out.println("Student#1 Detail");
		std1.displayStudentDetails();
		System.out.println();
		
		line('=');
		
		System.out.println("\nStudent#2 Detail");
		std2.displayStudentDetails();

	}//end of main method
	
	public static void line(char ch) {
		for (int i = 0; i <40; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}//end of line method

}
