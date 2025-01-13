import java.util.*;
public class Lab504 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] score = new double[5];
        double total = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.printf("Input score of students " + (i + 1) + " : ");
            score[i] = scan.nextDouble();
            total += score[i];
        }


        double average = total / score.length;

        System.out.printf("\nAverage of 5 students is %.2f\n", average);
       
        for (int i = 0; i < score.length; i++) {
            if (score[i] > average) {
                System.out.printf("> Student %d (%.2f)\n", (i + 1), score[i]);
            }
        }
    }
}
