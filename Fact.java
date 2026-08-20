package Recursion;
import java.util.*;
public class Fact{
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
    int factNum = factorial(n-1);
    int fact_n =n*factNum;
    return fact_n; 
    }
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println("Factorial of "+ n+" is "+ ans);
    }
}