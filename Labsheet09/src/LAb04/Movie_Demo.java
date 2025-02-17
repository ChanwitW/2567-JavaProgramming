package LAb04;
import java.util.*;
public class Movie_Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("Input movie id : ");
        String movieId = scan.nextLine();
        System.out.print("Input movie name : ");
        String movieName = scan.nextLine();

        System.out.println();

        System.out.print("Input director name : ");
        String directName = scan.nextLine();
        System.out.print("Input director's email : ");
        String directEmail = scan.nextLine();

        char gender;
        System.out.print("Input director's gender : ");
        while (true) {
            gender = Character.toUpperCase(scan.next().charAt(0));

            if (gender == 'M' || gender == 'F') {
                break;
            }
            System.out.print("Input director's gender, again: ");

        }

        System.out.println();

        int theaterNo;
        System.out.print("Input theater no : ");
        while (true) {
            if (scan.hasNextInt()) {
                theaterNo = scan.nextInt();
                if  (theaterNo >= 1 && theaterNo <= 15) 
                break;
            }
            System.out.println("Please input 1 - 15 only : ");
            scan.nextLine(); 
        }

        director director = new director(directName, directEmail, gender);
        Theater theater = new Theater(movieId , movieName , director , theaterNo);

        System.out.println("\n" + theater);
        scan.close();

    }
}
