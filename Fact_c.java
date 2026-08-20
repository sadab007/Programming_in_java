package Recursion;
import java.util.*;
public class Fact_c {
    public static int Fact(int n){
        if (n ==0 || n==1){
            return 1;
        }
        int ans = n*Fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no :");
        int n = sc.nextInt();
        System.out.println(Fact(n));
    }
}
