import java.util.Arrays;
import java.util.Scanner;

public class beautifulmatrix {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] matrix = new int[5][5];
    int row = 0;
    int col =0;
    for(int i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++){
            matrix[i][j] = in.nextInt();
            if(matrix[i][j]==1){
               row = i;
               col = j;
            }
        }
    }
    int sol = 0;
   int rowadd = Math.abs(2-row);
   int coladd = Math.abs(2-col);
   sol = rowadd+coladd;
 System.out.println(sol);


}
}
