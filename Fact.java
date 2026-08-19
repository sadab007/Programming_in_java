package practice;
import java.util.*;
public class Fact {
    public static void factorial(int n){
        if (n<0){
            System.out.println("Invalid number!");
        }
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+ n +" is " +fact);
    }
   public static void main(String[] args){
    System.out.print("Enter the no.  :");
Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    factorial(n);
   } 
}
