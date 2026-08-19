package practice;
import java.util.*;
public class Find_Num {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;

        int choice ;
         do{
            System.out.println("Enter the number :");
            int n = sc.nextInt();
         
         if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else {
                zero++;
            }
        System.out.print("Do you want to continiou? (1 for yes ,0 for no) ");
        choice = sc.nextInt();
              
    }while( choice ==1);{
        System.out.println("Positive numbers:"+ positive);
        System.out.println("Negative numbers:"+ negative);
        System.out.println("Zero numbers:"+ zero);
    }
}
}
