import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if(str.length()<=1){
            System.out.println(str);
            return;
        }
        int len = str.length()/2 + 1;
        char[] arr = new char[len];
        int j = 0;
        for(int i = 0; i < str.length(); i+=2){
            arr[j] = str.charAt(i);
            j++;
            if(i==str.length()-1){
                break;
            }
        }
      
        Arrays.sort(arr);
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            builder.append(arr[i]);
            if(i!=arr.length-1){
                builder.append('+');
            }
        }
        System.out.println(builder);
    }
}