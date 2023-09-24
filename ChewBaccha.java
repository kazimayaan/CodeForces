import java.util.Scanner;

public class ChewBaccha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextInt();
        long n = num;
        long newguy = 0;

        long res = 0;
        while (n != 0) {
            long digit = n % 10;
            if (digit > 4 && digit != 0) {
                if (digit != 9) {
                    long lol = 9 - digit;
                    digit = lol;
                }
            }
            res = res * 10 + digit;
            n /= 10;
        }
        long k = 0;
        while (res != 0) {
            if (res / 10 != 0) {

                long digit = res % 10;
                if (digit == 9) {
                    digit = 0;
                }
                k = k * 10 + digit;
                res /= 10;
            }
            long digit = res % 10;
            k = k * 10 + digit;
            res /= 10;
        }

        System.out.println(k);
    }
}
