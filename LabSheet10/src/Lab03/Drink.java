package Lab03;

public class Drink {
	private int type;
	private char size;
	
	public Drink(int type, char size) {
		this.type = type;
		this.size =size;
	}
	
	public Drink() {}
	
	public String getTypeName() {
		switch (type) {
		case 1:
			return "Hot";
		case 2:
			return "Cold";
		default:
			return "null";
		}
	}
	
	public int getTypePrice() {
		switch (type) {
		case 1:
			return 10;
		case 2:
			return 20;
		default:
			return 0;
		}
	}
	
	public String getSizeName() {
		if (size == 'S'&& size == 's') {
			return "Small";
		}
		else if (size == 'M'&& size == 'm') {
			return "Medium";
		}
		else if (size == 'L'&& size == 'l') {
			return "Large";
		}
		else {
			return null;
		}
	}
	
	public int getSizePrice() {
		if (size == 'S'&& size == 's') {
			return 15;
		}
		else if (size == 'M'&& size == 'm') {
			return 20;
		}
		else if (size == 'L'&& size == 'l') {
			return 25;
		}
		else {
			return 0;
		}
	}
	
	public int getTotalPrice() {
		return getTypePrice() + getSizePrice();
	}
	
}
