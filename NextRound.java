import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int counter = 0;
        int j = 1;
        int criminal = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (i == k - 1) {
                criminal = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= criminal && arr[i] > 0) {
                counter++;
            } else {
                break;
            }
        }
        System.out.println(counter);
    }
}
