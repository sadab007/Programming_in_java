package Main1;
import java.util.*;
public class L_R {
    public static void main(String[] args) {
        System.out.print("Enter size :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Operation :");
        int q = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter element :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    for(int i=0;i<q;i++){
        System.out.print("Enter left :");
        int l = sc.nextInt();
        System.out.print("Enter right :");
        int r = sc.nextInt();
      //  l -=1;
      //  r-=1;
        int sum = 0;
        for(int j=l-1;j<=r;j++){
            sum +=arr[j]; 
        }
        System.out.print(sum);
    }
    }
}
 