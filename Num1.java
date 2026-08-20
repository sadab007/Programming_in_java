package Recursion;
import java.util.*;
public class Num1 {
    public static void printNum(int n ,int i){
         
        if(i>n)
            return;
        System.out.println(i);
        printNum(n,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int i=1;
        printNum(n,i);
    }
}
