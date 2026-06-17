package pattern;
import java.util.*;
public class NumberPyramid {
   public static void main(String[] args){
    System.out.print("Enter the no.:");
    Scanner sc = new Scanner(System.in);
    int n =  sc.nextInt();
    int i=1;
    while (i<=n) {
        int space =1;
        while (space<=n-i) {
            System.out.print(" ");   
            space++; 
        }
        int j = 1;
        while (j<=i) {
            System.out.print(i+" ");   
            j++; 
        }
        
        System.out.println();
        i++;
        }
    }
}

