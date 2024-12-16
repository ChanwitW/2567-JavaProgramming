import java.util.*;

import javax.swing.ScrollPaneLayout;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String fullName;
		String firstName;
		
		System.out.println("Please enter your name, seperate by a space.");
		System.out.print(".");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' ');
		firstName = fullName.substring(0,space);
		
		System.out.println(abbreviatName(fullName));
				
		input.close();

	}
	
	public static String abbreviatName(String fullName) {
		String intitialLetter="";
		
		for (int i = 0; i <fullName.length(); i++) {
			if (fullName.charAt(i)==' ') {
				intitialLetter = (intitialLetter+fullName.charAt(i)).toUpperCase();
				intitialLetter = intitialLetter+".";
			}
		}
		return intitialLetter;
	}

}
