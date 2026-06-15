package pattern;
import java.util.*;
public class Butterfly {
    public static void main(String [] args){
        System.out.println("Enter the no. :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            } 
            j=1;    
            /*
            int space = 1;
            space = 2*(n-i);
            while(j<=space){
            System.out.print(" ");
            }
             */
            while (j<=n-i) {
                System.out.print("  ");
                j++;
            } 
             j=1;
              while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();  
            i++;  

        }
         //i=1;
         i=n;
        int j;
       // while (i<=n) {
          while(i>=1){
            j=1;
          //  while (j<=n-i+1) {
          while(j<=i){
                System.out.print("*");
                j++;
            }
            j=1;
          //  while(j<=i-1){

           /*
            int space = 1;
            space = 2*(n-i);
            while(j<=space){
            System.out.print(" ");
            }
             */
            while(j<=n-i){  
                System.out.print("  ");
                j++;
            }
            j=1;
           // while(j<=n-i+1){
             while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
/* 

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

*/