package ratingfirst;
import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        for(int i = 0; i< n; i++){
            String str = in.next();
            if(str.contains("+")){
                counter++;
            }
            else{
                counter--;
            }
        }
        System.out.println(counter);
    }
}
