import javax.swing.*;
public class Lab508 {
    public static void main(String[] args) {
        int[] nums = {25, 78, 41, 22, 36, 85, 37};
        int index;

        while (true) {
            String input = JOptionPane.showInputDialog("Input index of array:");
            index = Integer.parseInt(input);

            if (checkIndex(nums, index)) {
                String message = "Current data, nums[" + index + "] is " + currentData(nums, index) + "\n";

                if (index > 0) {
                    message += "Previous data, nums[" + (index - 1) + "] is " + prevData(nums, index) + "\n";
                } else {
                    message += "No previous data\n";
                }

                if (index < nums.length - 1) {
                    message += "Next data, nums[" + (index + 1) + "] is " + nextData(nums, index) + "\n";
                } else {
                    message += "No next data\n";
                }
                JOptionPane.showMessageDialog(null, message);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid index, please try again.");
            }
        }
    }

    public static boolean checkIndex(int[] nums, int index) {
        return index >= 0 && index < nums.length;
    }

    public static int currentData(int[] nums, int index) {
        return nums[index];
    }
    
    public static int prevData(int[] nums, int index) {
        return nums[index - 1];
    }

    public static int nextData(int[] nums, int index) {
        return nums[index + 1];
    }
    
}
