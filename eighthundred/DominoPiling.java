package eighthundred;
import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        // int d = 2;
       int area = m*n;
       int sol = area/2;
       System.out.println(sol);
    }
}
