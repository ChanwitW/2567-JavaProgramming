import javax.swing.*;
public class Lab507 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            String input = JOptionPane.showInputDialog("Input number " + (i + 1) + ":");
            numbers[i] = Integer.parseInt(input);
        }

        showEven(numbers);
        showOdd(numbers);
    }

    public static void showEven(int[] nums) {
        String message = "List of even numbers: \n";
        for (int _nums : nums) {
            if (_nums % 2 == 0) {
                message += _nums + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public static void showOdd(int[] nums) {

        String message = "List of odd numbers: \n";
        for (int _nums : nums) {
            if (_nums % 2 != 0) {
                message += _nums + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
