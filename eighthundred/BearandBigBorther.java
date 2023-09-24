package eighthundred;
import java.util.Scanner;

public class BearandBigBorther {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limak = in.nextInt();
        int bro = in.nextInt();
        int counter = 0;
        while(limak<=bro){
            ++counter;
            limak*=3;
            bro*=2;
        }
        System.out.println(counter);
    }
}
