import java.util.*;
public class FictionDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Book title: ");
		String bookTitle = scan.nextLine();
		System.out.print("Book publish year: ");
		int publishYear = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Author name: ");
		String authorName = scan.nextLine();
		System.out.print("Author Email: ");
		String authorEmail = scan.nextLine();
		
		FictionBook book1 = new FictionBook(bookTitle, publishYear);
		book1.setAuthorname(authorName);
		book1.setEmail(authorEmail);
		while (!book1.checkEmail()) {
			System.out.print("Author Email, again: ");
			authorEmail = scan.nextLine();
		}
		Line();
		System.out.println(book1);
		
	
	}
	
	public static void Line() {
		for (int i = 0; i < 40; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

}
