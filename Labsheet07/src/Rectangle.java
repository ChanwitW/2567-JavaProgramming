import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.IllegalFormatWidthException;

public class Rectangle {
	//create two private attribute
	private float length;
	private float width;
	
	//defualt costructor
	Rectangle () {
		length = 1.0f;
		width = 1.0f;
		
	}
	/*private float lenght = 1.0f;
	  private float width = 1.0f;
	 */
	
	//paeameter constructor
	Rectangle(float lenght , float width) {
		this.length = lenght;
		this.width= width;
	}
	
	
	//getter method
	public float getLenght() {
		return this.length;
	}
	
	public void setLenght(float lenght) {
		this.length = length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	//method to calculate area
	public double getArea() {
		return this.length * this.width;
	}
	
	//method to calculate perimeter
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	//method toString
	public String toString() {
		return "Rectangle [lenght = " + this.length + ",width = " + this.width + "]";
	}
	
}
