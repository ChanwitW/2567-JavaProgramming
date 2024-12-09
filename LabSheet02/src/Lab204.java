import java.util.*;;
public class Lab204 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int x,y;

        System.out.print("Input value of X : ");
            x = scan.nextInt();
        do {
            System.out.print("Input value of Y : ");
            y = scan.nextInt();

            if (y <= x) {
                System.out.print("Input value of Y , again : ");
                
            }
        } while (y <= x);

        int sum = 0;
        int i = x;
        do {
            sum += i;
            System.out.println(x + " + " + i + " = " + sum);
            i++;
        } while (i <= y);
    }
}
