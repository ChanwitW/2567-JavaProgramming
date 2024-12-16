import javax.swing.*;
public class Lab03_1 {

	public static void main(String[] args) {
		int countSpace = 0;
		int wordCount = 0;
		String sentence = "";
		
		sentence = JOptionPane.showInputDialog(null, "Input a sentence:");
		
		while (true) {
			
			if (sentence.endsWith(".")) {
				break;
			}
			else {
				sentence = JOptionPane.showInputDialog(null, "Input a sentence, again : ");
			}

		}
		for (int i = 0; i<sentence.length(); i++) {
				char sp = sentence.charAt(i);
				
				if (sp == ' ') {
					countSpace++;
				}
			}
		
		String countSentence = sentence.trim();
		int wordStart = 0;	
		
		while (wordStart < countSentence.length()) {
            int nextSpace = countSentence.indexOf(' ', wordStart);
            if (nextSpace == -1) { 
                wordCount++;
                break;
            }
            wordCount++;
            wordStart = nextSpace + 1;
        }
			
		JOptionPane.showMessageDialog(null, "This sentence has " + countSpace + " spacebar.\n" +
									  "This sentence has " + wordCount + " word.");

		
	}

}
