package Problems;

import java.util.*;

public class Vowls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word ::");
        String name = sc.next();
        name = new String(name);
        int count = 0;
        int s = name.length();
        for (int i = 0; i < s; i++) {
            char n = name.toLowerCase().charAt(i);
            if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u') {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
