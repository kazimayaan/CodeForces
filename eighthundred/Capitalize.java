package eighthundred;
import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Character ch = str.charAt(0);
        char newChar = Character.toUpperCase(ch);
        String newStr = newChar + str.substring(1,str.length());
        System.out.println(newStr);

    }
}
