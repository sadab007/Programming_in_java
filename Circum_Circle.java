package practice;
import java.util.*;
public class Circum_Circle {
    public static void Circum(int r){
        float circumference =1;
        circumference =(float) (2 * 3.14 * r);
        System.out.println("Circumference is "+ circumference);
    }
    public static void main(String[] args) {
        System.out.print("enter the no. :");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Circum(r);
    }
}
