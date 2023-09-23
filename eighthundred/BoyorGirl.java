package eighthundred;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Character> sets = new HashSet<>();
        String str = in.next();
        for(int i = 0; i < str.length(); i++){
            sets.add(str.charAt(i));
        }
        int n = sets.size();
        if(n%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
