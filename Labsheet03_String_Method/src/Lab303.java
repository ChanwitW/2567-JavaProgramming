
import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		String sentence = "";
		
		System.out.print("Input a sentence : ");
		sentence = scan.nextLine();
		
		while (true) {
			
			if (sentence.endsWith(".")) {
				break;
			}
			else {
				System.out.print("Input a sentence, again : ");
				sentence = scan.nextLine();
			}

		}
		for (int i = 0; i<sentence.length(); i++) {
				char sp = sentence.charAt(i);
				
				if (sp == ' ') {
					count++;
				}
			}
			
		System.out.print("This sentence has " + count + " " + "spacebar.");

		
		scan.close();
	}

}
