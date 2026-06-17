package pattern;
import java.util.*;
public class Plus {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number :");
    int n = sc.nextInt();
    int i=1;
    while(i<=n){
        int j = 1;
        while(j<=n){
            if((n/2)+1==i ||(n/2)+1== j){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            j++;
            System.out.print(" ");
        }
        i++;
        System.out.println();
    }
    }
}
