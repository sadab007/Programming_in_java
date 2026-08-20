package Recursion;
import java.util.*;
public class Sum {
    public static void sumNum(int i, int n,int sum ){
        if (i==n){
            sum +=i;
            System.out.println(sum);
            return;
        }
            
          sum = sum + i;
        sumNum(i+1, n,sum); 
    }
    public static void main(String[] args) {
        int i =1;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size :");
        int n = sc.nextInt();
        sumNum(i, n,sum);
    }
}
