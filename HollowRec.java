package pattern;
import java.util.*;
public class HollowRec {
    public static void main (String[] args){
        System.out.println("Enter two numbers :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=m){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
