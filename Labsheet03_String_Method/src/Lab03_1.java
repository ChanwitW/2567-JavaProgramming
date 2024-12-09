import javax.swing.*;
public class Lab03_1 {

	public static void main(String[] args) {
		int count = 0;
		String sentence = "";
		
		sentence = JOptionPane.showInputDialog("Input a sentence");
		
		while (true) {
			
			if (sentence.endsWith(".")) {
				break;
			}
			else {
				sentence = JOptionPane.showInputDialog("Input a sentence, again : ");
			}

		}
		for (int i = 0; i<sentence.length(); i++) {
				char sp = sentence.charAt(i);
				
				if (sp == ' ') {
					count++;
				}
			}
			
		JOptionPane.showMessageDialog(null, "This sentence has " + count + " " + "space.");

	}

}
