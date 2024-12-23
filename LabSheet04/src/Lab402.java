import javax.swing.*;
public class Lab402 {
    public static void main(String[] args) {
        int year = -1;
        boolean isValid = false;

        while (isValid == false) { 
            String input = JOptionPane.showInputDialog("Input year:");

            boolean isNumber = true;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c < '0' || c > '9') { 
                    isNumber = false;
                    break;
                }
            }

            if (isNumber) {
                year = Integer.parseInt(input); 
                if (checkYear(year)) {
                    isValid = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Please input a year between 1000 - 3000.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input. Please input a valid number.");
            }
        }
        
        if (isLeapYear(year)) {
            JOptionPane.showMessageDialog(null, year + " is Leap year.");
        } else {
            JOptionPane.showMessageDialog(null, year + " is NOT Leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean checkYear(int year) {
        return year >= 1000 && year <= 3000;
    }
}
