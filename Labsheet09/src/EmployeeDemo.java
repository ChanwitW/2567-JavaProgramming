import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Employee id : ");
		String empId = scan.next();
		scan.nextLine();
		System.out.print("Input Employee name : ");
		String empName = scan.nextLine();
		System.out.print("Input Employee salary : ");
		double empSalary = scan.nextDouble();
		System.out.print("Input Employee sales : ");
		double empSales = scan.nextDouble();
		
		Sales emp9 = new Sales(empId, empName, empSalary ,empSales);
		System.out.println(emp9);
		
		System.out.println("Total salary " + 
		emp9.getSalary() + emp9.getCommission() + " baht.");
	}

}
