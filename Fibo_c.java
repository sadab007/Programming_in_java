package Recursion;
import java.util.*;
public class Fibo_c {
    public static int fibo(int n){
       // System.out.println(n);
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibo(n-1)+fibo(n-2);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();
        System.out.println("Answer is "+fibo(n));
    }

}
// check this code ----------------------------------------------------->