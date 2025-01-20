
public class Employee {
	//create attribute
	private int id ;
	private String firstname;
	private String lastName;
	private int salary;
	
	//parameter constructors
	Employee(int id , String firtname , String lastname , int salary) {
		this.id = id;
		this.firstname = firtname;
		this.lastName = lastname;
		this.salary = salary;
	}
	
	//getter method
	public int getId() {
		return this.id;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public String getLastname() {
		return this.lastName;
	}
	
	public String getName() {
		return this.firstname + " " + this.lastName;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return this.salary*12;
	}
	
	public int raiseSalary(int perent) {
		salary += (salary*perent)/100;
		return salary;
	}
	
	//method toString 
	public String toString() {
		return "Employee [id = " + this.id + ", name = " + this.firstname + " " + this.lastName + ", Salary = " + salary + "]";
	}
	
	

}
