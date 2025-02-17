package Lab03;

public class Coffee {
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	public Coffee(int type , char sizeCoffee , int typeCoffee , Barista barista) {
		type = type;
		this.sizeCoffee = sizeCoffee;
		this.typeCoffee = typeCoffee;
		this.barista = barista;
	}
	
	public Coffee(int type , int typeCoffee) {
		this(type, '0', typeCoffee, null);
	}
	
	public Barista getBarista() {
		return this.barista;
	}
}
