import java.util.*;
public class Lab503 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[7]; 
        int[] oddNumbers = new int[7]; 
        int oddCount = 0; 

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            nums[i] = scan.nextInt();
        }

        for (int _num : nums) {
            if (_num % 2 != 0) { 
                oddNumbers[oddCount] = _num; 
                oddCount++;
            }
        }

        System.out.println("There are " + oddCount + " odd numbers.");
        System.out.print("List of odd numbers: ");
        for (int i = 0; i < oddCount; i++) { 
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
