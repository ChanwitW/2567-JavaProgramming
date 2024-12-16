import java.util.*;
public class Lab307 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Text: ");
        String text = scan.nextLine();

        text = text.replace(" ", "").toLowerCase();

        boolean isPalindrome = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length()-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("It is not palindrome");
        }
    }
}
