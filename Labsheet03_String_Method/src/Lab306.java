import java.util.*;
public class Lab306 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = "";
        System.out.print("Message : ");
        message = scan.nextLine();

        if(message.toLowerCase().indexOf("nichi")>=0)  {
            System.out.print("Nichi on a sentance");
        }
        else {
            System.out.print(message);
        }


        scan.close();
    }
}
