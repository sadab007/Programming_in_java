package Main1;
import java.util.*;
public class Array2D {
    public static void main(String[] args) {
        System.out.println("Enter row and col : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        for(int i =0; i<r;i++){
            for(int j =0;j<c;j++){
                a[r][c]=sc.nextInt();
                
            }

        }
    }
}
