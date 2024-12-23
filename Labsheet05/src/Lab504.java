import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] studentScore = new double[5];
		double total = 0;
		
		for (int i = 0; i < studentScore.length; i++) {
			System.out.print("Input number " + (i+1) + " : ");
			studentScore[i] = scan.nextDouble();
			total += studentScore[i]/5;
		}
		
		System.out.println();
		System.out.printf("Average of 5 student is %.2f" , total);
		
		int i = 1;
		for (double d : studentScore) {
			if (d > total) {
				System.out.printf("\n > Student" +  " " + "%d" + " " + "(" + "%.2f" + ")", i , d);
			}
			i++;
		}
	}

}
