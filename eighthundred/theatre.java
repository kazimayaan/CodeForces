package eighthundred;

import java.util.Scanner;

public class theatre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long length = 0;
        long breadth = 0;
        if (n % a == 0) {
            length = n / a;
        } else {
            length = n / a + 1;
        }

        if (m % a == 0) {
            breadth = m / a;
        } else {
            breadth = m / a + 1;
        }
        System.out.println(length * breadth);
    }
}
