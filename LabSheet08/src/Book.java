import java.util.PrimitiveIterator.OfDouble;

public class Book {
	private String title;
	private  Author author;
	private int pages;	
	
	Book(String title, Author author , int pages){
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	public Book(String title, Author author) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	Book(){
		this(null, null);
		/*this.title = null
		 this. author = null
		 this,pages = 0 */
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public Author author() {
		return this.author;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public int getPages() {
		return this.pages;
	}
	
	public String toString() {
		return getTitle() + " has " + getPages() + " pages write by " + author; //(+ author = author.toString)
	}
}
