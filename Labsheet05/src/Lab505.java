
import java.util.*;
public class Lab505 {
    public static void main(String[] args) {
        int[] numbers = {78, 38, 56, 41, 25, 92, 75};
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Input index of array: ");
            int index = scan.nextInt();

            if (index < 0 || index >= numbers.length) {
                System.out.println("Index out of range.");
                break;
            }
            System.out.println("Value in current index is: " + numbers[index]);

            if (index + 1 < numbers.length) {
                System.out.println("Value in next index is: " + numbers[index + 1]);
            } else {
                System.out.println("Sorry, " + index + " is the last index in array.");
            }
        }
    }
}
