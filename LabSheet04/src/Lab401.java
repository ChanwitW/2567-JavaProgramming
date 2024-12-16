import javax.swing.*;
public class Lab401 {
	//กำหนดตัวแปรแบบ global vatiable
	static String varEmail;

	public static void main(String[] args) {
		inputEmail();
	}//end of main method
	
	public static void inputEmail() {
		String ans = "";
		do {
			varEmail = JOptionPane.showInputDialog("Input ypur e-mail");
			if (varEmail != null && !varEmail.isEmpty()) { //email ที่รับมา != null เรียกใช้ metho ตรวจสอบ email จรวจสอบว่ามี spacrbar หรือไม่
				checkEmailError(varEmail);
			}
			else { //email == null show error
				JOptionPane.showMessageDialog(null, "Email cannot be empty!");
			}
			ans = JOptionPane.showInputDialog("Continue?(y||Y to coninue)");
			
		} while (ans != null && ans.equalsIgnoreCase("y"));
		
	}//end of input email method
	
	public static void checkEmailError(String email) {
		while (email.startsWith("@") || email.contains(" ")) {
			email = JOptionPane.showInputDialog("Input your email again:");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, 
				checkEmail(email)
				?"Your e-mail is "+ email
				:"Your e-mail is not hotmail or gmail address");
	}
	
	public static boolean checkEmail(String email) {
		
		if (email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")) {
			return true;
		}
		else {
			return false;
		}
	}
		

}
