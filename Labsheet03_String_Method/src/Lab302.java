import javax.swing.*;
public class Lab302 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail").toLowerCase();
		
		while (inputEmail.startsWith("@") || inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail");
		}
		
		while (true) {
				if (inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com") || inputEmail.startsWith("@") || inputEmail.contains(" ")) {
					JOptionPane.showMessageDialog(null, "Your e-mail is " + inputEmail);
					break;
				}
				else {
						JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
						inputEmail = JOptionPane.showInputDialog("Input your e-mail");
				}
		}
		
	}

}
