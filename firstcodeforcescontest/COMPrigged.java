package firstcodeforcescontest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class COMPrigged {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0 ; i <n; i++){
            int num = in.nextInt();
            int w = 0;
            int flag = 0;
            int[][] arr = new int[num][2];
            for(int row =0; row < arr.length; row++){
                for(int col = 0; col < 2; col++){
                    arr[row][col] = in.nextInt();
                }
            }
            int endurance = arr[0][1];
            w = arr[0][0];
            List<Integer> list = new ArrayList<>();
            for(int player = 1; player<arr.length;player++){
                if(arr[player][0]>=w){
                    list.add(player);
                }
            }
            for(int j = 0; j < list.size(); j++){
                if(arr[list.get(j)][1]>=endurance){
                    System.out.println(-1);
                    flag =1;
                    break;
                }
            }
            if(flag ==0){
                System.out.println(w);
            }
        }
    }
}
