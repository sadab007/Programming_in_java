package practice;
import java.util.*;

public class Avg_3Num {
    public static void Avg(int a,int b, int c){
        int sum = 0;
        sum = (a+b+c)/3;
        System.out.println("sum of 3 no. :" +sum);
    }
    public static void main(String[] args){
        System.out.print("Enter 3 no. :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Avg(a,b,c);
    }
}
