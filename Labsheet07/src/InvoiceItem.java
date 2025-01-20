
public class InvoiceItem {
	//create attribute
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	//constructors
	InvoiceItem(String id , String desc , int qty , double unitPrice){
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	//Getting and  setting method
	public String getId() {
		return this.id;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public double getUnitPrice() {
		return this.unitPrice;
	}
	
	public void settUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getTotal() {
		return this.unitPrice*this.qty;
	}
	
	//method toString
	public String toString() {
		return "Invoiceitem [id = " + this.id + ", desc = " + this.desc + ", qty = " + this.qty + ", UnitPrice = " + this.unitPrice + "]";
	}
}
