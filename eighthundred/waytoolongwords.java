package eighthundred;
import java.util.Scanner;

public class waytoolongwords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        for(int i = 0; i < n; i++){

            String input = sc.next();
           
            if(input.length()>9){
                int lol = input.length();
                System.out.println(""+ input.charAt(0)+ (lol-2) +input.charAt(input.length()-1));
            }
            else{
                System.out.println(input);
            }
            
            
        }
        
        
        sc.close();
        return;
        
        
    }
}