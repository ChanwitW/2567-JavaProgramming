
import java.time.Year;

import javax.swing.*;
public class Lab402 {

	public static void main(String[] args) {
		int year = Integer.parseInt(null);
		checkYear(0);
	}
	
	public static boolean checkYear(int year) {
		
		do {
			JOptionPane.showInputDialog("Input year :");
			if (year >= 1000 && year <= 3000) {
			return true;
		}
		else {
			return false;
		}
		} while (year <1000 && year>3000);
		
	}

}
