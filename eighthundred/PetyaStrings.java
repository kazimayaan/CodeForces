package eighthundred;
import java.util.Scanner;

public class PetyaStrings {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.compareToIgnoreCase(str2) < 0) {
            System.out.println(-1);
        } else if (str1.compareToIgnoreCase(str2) == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
