package Lab03;

public class Barista {
	private String name;
	private char gender;
	
	public Barista(String name , char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public Barista() {}
	
	public String getName() {
		return this.name;
	}
	
	public String getGenderName() {
		if (gender == 'M' && gender == 'm' ) {
			return "Male";
		}
		else if (gender == 'F' && gender == 'f') {
			return "Female";
		}
		else {
			return " ";
		}
		
	}
}
