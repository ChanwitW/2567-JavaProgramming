
public class TestEmployee {
	public static void main(String[] arge) {
		//Create two Employee objects
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//Set employee details
		emp1.setEmployeeDetails("Jhon", 45, 20.0);
		emp2.setEmployeeDetails("Jane", 38, 25.0);
		
		//Display employee details
		System.out.println("Employee 1 Details:");
		emp1.displayEmployeeDetails();
		
		System.out.println("\nEmployee 2 Details:");
		emp2.displayEmployeeDetails();
		
		
	}//End of main method
		
}//End of TestEmployee class

