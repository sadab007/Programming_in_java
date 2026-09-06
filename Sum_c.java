package Recursion;
import java.util.*;
/*
public class Num {
    public static void SumNum( int i ,int sum,int n){
        if (i>n){
            System.out.println(sum);
            return;
        }
        sum +=i;
        SumNum(i+1, sum, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num :");
        int n = sc.nextInt();
        int i =1;
        int sum=0;
        SumNum(i,sum,n);
}
}
*/

/*
public class Num {
    public static int Sum(int n){
        if (n==0){
            return 0;
        }
     return n+Sum(n-1);
    }
public static void main(String[] args) {
    System.out.println(Sum(5));
}
    
}
*/

public class Sum_c {
    public static void Sum(int n){
        if (n==0){
            return ;
        }
        
        Sum(n-1);
        System.out.println(n);
    }
public static void main(String[] args) {
   Sum(5);
}
    
}
