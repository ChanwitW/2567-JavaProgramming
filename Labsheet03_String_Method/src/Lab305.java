import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";

        while (true) {
            System.out.print("Input some sentence: ");
            sentence = scanner.nextLine();
             
            if (sentence.endsWith(".")) {
                break;
            } else {
                System.out.println("The sentence must end with a full stop point (.)");
            }
        }

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i); 
            if (ch == ' ') {
                System.out.println(); 
            } else if (ch != '.') {
                System.out.print(ch); 
            }
        }

        scanner.close();
    }
}
