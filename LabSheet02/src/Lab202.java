import java.util.*;
public class Lab202 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int previousNumber = 0;
        int currentNumber;

        while (true) {
            System.out.print("Input number : ");
            currentNumber = scan.nextInt();

            if (previousNumber != 0 && currentNumber < previousNumber) {
                break;
            }
            previousNumber = currentNumber;
        }
        System.out.println("BYE BYE");
    }
}
