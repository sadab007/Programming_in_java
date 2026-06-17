package pattern;
import java.util.*;
public class Palindromic {
    public static void main(String[] args){
        System.out.print("Enter the no. :");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while(i<=n){
            int space =1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            int j=i;
            while(j>=1){
                System.out.print(j);
                j--;
            }
             j=2;
             while (j<=i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
/*
    1
   212
  32123
 4321234
543212345
*/
