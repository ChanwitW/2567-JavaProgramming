import java.util.*;
public class Lab102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input the number of minutes : ");
        int numberOfMinutes = scan.nextInt();

        int minutesPerYear = 60 * 24 * 365;
        int minutesPerDay = 60 * 24;

        int year = numberOfMinutes / minutesPerYear ;
        int minutesLeft = numberOfMinutes % minutesPerYear ;
        int day = minutesLeft / minutesPerDay ;

        System.out.println(numberOfMinutes + " " + "minutes is approximetery" + " " + year + " " + "Years and" + " " + day + " "  + "days");
    }
}