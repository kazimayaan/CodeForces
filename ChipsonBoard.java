import java.util.Scanner;

public class ChipsonBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            
            int[] arr1 = new int[num];
            int[] arr2 = new int[num];
            for (int j = 0; j < num; j++) {
                arr1[j] = in.nextInt();
            }
            for (int j = 0; j < num; j++) {
                arr2[j] = in.nextInt();
            }
            
            int sum = 0;

            int mininarr1 = Integer.MAX_VALUE;
            int mininarr2 = Integer.MAX_VALUE;
            for (int j = 0; j < num; j++) {
                if (mininarr1 > arr1[j]) {
                    mininarr1 = arr1[j];
                }
                if (mininarr2 > arr2[j]) {
                    mininarr2 = arr2[j];
                }
            }
            if (mininarr1 <= mininarr2) {
                for (int j = 0; j < num; j++) {

                    sum = sum + mininarr1 + arr2[j];

                }
            } else {
                for (int j = 0; j < arr2.length; j++) {
                    sum = sum + mininarr2 + arr1[j];
                }
            }
            System.out.println(sum);
        }
    }
}
