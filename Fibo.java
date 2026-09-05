package Recursion;
import java.util.*;
public class Fibo {
    public static void fibonaci(int i,int n,int a,int b){
        if(i>n){
            return ;
        }
        a = a+b;
        b = a-b;
        System.out.println(b);
        fibonaci(i+1, n, a, b);
    }
    public static void main(String[] args) {
        System.out.print("Enter num :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int a = 0,b = 1;
       // a = a+b;
        //b = a+b;
        fibonaci(i, n, a, b);
    }
}
