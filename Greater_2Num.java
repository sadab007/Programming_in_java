package practice;
import java.util.*;
public class Greater_2Num {
   public static void Greater(int a, int b){
    if ( a>b){
        System.out.println(a+" is greater than "+b);
    }
    else{
        System.out.println(b+" is greater than "+a);
    }
   }
   public static void main(String[] args){
    System.out.println("Enter two numbers :");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    Greater(a, b);
   }
}
