package Recursion;
import java.util.*;
public class PowNum {
    public static int powCal(int n,int x){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int powNm1 = powCal(n-1, x);
        int powNum = x *powNm1;
        return powNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num :");
        int x = sc.nextInt();
        System.out.print("Enter pow :");
        int n = sc.nextInt();
        System.out.println(powCal(n, x));
    }
}
