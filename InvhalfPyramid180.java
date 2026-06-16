package pattern;
import java.util.*;

public class InvhalfPyramid180 {
     public static void main(String[] args){
        System.out.println("Enter the no. :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int space =1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        } 
    }
    
}
