package eighthundred;
import java.util.Scanner;

public class BuyBananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long k = in.nextInt();
        long n = in.nextInt();
        long w = in.nextInt();
        if (w == 0) {
            System.out.println(0);
        }
        long totalcost = 0;
        for (int i = 1; i <= w; i++) {
            totalcost = totalcost + (i * k);
        }
        if (totalcost < n) {
            System.out.println(0);
        } else {

            long fromfriend = totalcost - n;
            System.out.println(fromfriend);
        }
    }
}
