import java.util.*;
public class Lab502 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            nums[i] = scan.nextInt();
        }

        int sum = sumOfPos(nums);

        System.out.println("Summation of positive numbers is " + sum);

        scan.close();
    }

    public static int sumOfPos(int[] nums) {
        int sum = 0;
        for (int _num : nums) {
            if (_num > 0) { 
                sum += _num;
            }
        }
        return sum;
    }
}
