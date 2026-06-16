package pattern;

import java.util.*;

public class InvHalfPyramidNum {
    public static void main(String[] args){
        System.out.println("Enter the no.:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while (j<=n-i+1) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }   
}
