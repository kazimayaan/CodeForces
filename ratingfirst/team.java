package ratingfirst;
import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int sum = x+y+z;
            if(sum >= 2){
                total++;
            }
        }
        System.out.println(total);
        return;
    }
}
