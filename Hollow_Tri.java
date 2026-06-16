package pattern;

import java.util.*;

public class Hollow_Tri {
    public static void main(String[] args) {
        System.out.print("Enter size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) // Row ;

        {
            int j = 1;
            while (j < i) // space ;
            {
                System.out.print(" ");
                j++;
            }
            j = 1;
            int str = (2 * n - 2 * i) + 1;
            while (j <= str) // col ;
            {
                if(i==1 || j==1 || j == ((2*n) - (2*i))+1){
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
