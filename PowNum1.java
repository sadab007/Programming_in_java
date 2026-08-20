package Recursion;
import java.util.*;
public class PowNum1 {
    public static int powNum(int n ,int x){
        if(n==0){
            return 0;
        }
        if(x==0){
            return 1;
        }
        if(x % 2 == 0){
            return powNum(n,x/2)*powNum(n, x/2);
        }
        else{
            return powNum(n,x/2)*powNum(n, x/2)*n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();
        System.out.print("Enter pow : ");
        int x = sc.nextInt();
        int ans = powNum(n, x);
        System.out.println(ans);
    }
}
