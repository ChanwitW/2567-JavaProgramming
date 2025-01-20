
public class TestEmployee {
	public static void main(String[] args) {
		// Test constructor and toString()
		Employee e1 = new Employee(8, "Peter", "Tan", 2500);
		System.out.println(e1); // toString();
		e1.setSalary(999); // Test Setters and Getters
		System.out.println(e1); // toString();
		System.out.println("Id is: " + e1.getId());
		System.out.println("firstname is: " + e1.getFirstname());
		System.out.println("lastname is: " + e1.getLastname());
		System.out.println("salary is: " + e1.getSalary());
		System.out.println("name is: " + e1.getName());
		System.out.println("annual salary is: " +
		e1.getAnnualSalary()); // Test method
		
		// Test raiseSalary()
		System.out.println("Raise salary = " + e1.raiseSalary(10));
		System.out.println(e1);
	}
}
