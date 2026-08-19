package practice;

import java.util.*;

public class Fabo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        int a = 0, b = 1;
        n = Math.abs(n);
        System.out.println("Fibonncai ------------->");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            a = a + b;
            b = a - b;

            System.out.print(a + " ");
            if (i != n - 1) {
                System.out.print(",");
            }
        }

        System.out.print("]");
       

    }
}
