import java.util.Scanner;

public class Rocks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        int res = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                res++;
            }
        }
        System.out.println(res);
    }
}
