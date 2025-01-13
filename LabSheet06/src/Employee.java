
public class Employee {
	//defind attributes
	private String name;
	private int hourWorked;
	private double hourlyrate;
	
	// Method to set employee dettails
	public void setEmployeeDetails(String empName, int hours , double rate ) {
		name = empName;
		hourWorked = hours;
		hourlyrate = rate;
	}
	
	//Method to calculate salary
	public double calculateSalary() {
		double salary = hourWorked * hourlyrate;
		if (hourlyrate > 40) {
			double bonus = salary * 0.10;
			salary += bonus;
		}
		return salary;
	}
	
	//Method to display e,ployee detail
	public void displayEmployeeDetails() {
		System.out.println("Name: " + name);
		System.out.println("Hour Worked: " + hourWorked);
		System.out.println("Hour Rate: " + hourlyrate);
		System.out.println("Total salary: " + calculateSalary());
	}
	
	
}
