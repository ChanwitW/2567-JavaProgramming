import java.util.*;
public class TestEmployeeInpur {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//create two Employee object
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		//Input for first employee
		System.out.println("Enter detail for employee 1 : ");
		System.out.print("Name : ");
		String empName1 = scan.nextLine();
		System.out.print("Hours Worked : ");
		int empHoureWorked1 = scan.nextInt();
		System.out.print("Hourly Rate : ");
		double empHourlyrate1 = scan.nextDouble();
		
		//Set employee details
		emp1.setEmployeeDetails(empName1, empHoureWorked1, empHourlyrate1);
		
		//display employee details 1
		System.out.println("\nEmployee 1 Details:");
		emp1.displayEmployeeDetails();
		
		scan.nextLine();
		
		//input for second employee
		System.out.println("\nkEnter detail for employee 2 : ");
		System.out.print("Name : ");
		String empName2 = scan.nextLine();
		System.out.print("Hours Worked : ");
		int empHoureWorked2 = scan.nextInt();
		System.out.print("Hourly Rate : ");
		double empHourlyrate2 = scan.nextDouble();
		
		//Set employee details
		emp2.setEmployeeDetails(empName2, empHoureWorked2, empHourlyrate2);
		
		//display employee details 2
		System.out.println("\nEmployee 2 Details:");
		emp2.displayEmployeeDetails();
		
		
		
		
	}

}
