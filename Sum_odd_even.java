package practice;
import java.util.*;
public class Sum_odd_even {
    public static void Sum(int n){
        int evensum = 0;
        int oddsum =0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
             evensum = evensum + i;
            }
            else{
                oddsum = oddsum +i;
            }
        }
        System.out.println("even sum is :"+ evensum);
        System.out.println("Odd sum is  : "+ oddsum);
    }
    public static void main(String[] args){
        System.out.println("Enter the no  :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sum(n);
    }
}