

import javax.swing.JOptionPane;
public class Lab301 {

	public static void main(String[] args) {
		int count = 0;
		String sentence = "";
		
		JOptionPane.showInputDialog("Input a sentence");
		
		while (true) {
			
			if (sentence.endsWith(".")) {
				break;
			}
			else {
				System.out.print("Input a sentence, again : ");
			}

		}
		for (int i = 0; i<sentence.length(); i++) {
				char sp = sentence.charAt(i);
				
				if (sp == ' ') {
					count++;
				}
			}
			
		System.out.print("This sentence has " + count + " " + "spacebar.");

		
	}

}
