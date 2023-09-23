package eighthundred;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String newStr = str.toLowerCase();
        // System.out.println(newStr);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = newStr.charAt(i);
            if (ch == 'a' || ch == 'o' || ch == 'y' || ch == 'e' || ch == 'u' || ch == 'i') {
                continue;
            }
            builder.append('.');
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
