//  Insertion sorting

package Main2;
import java.util.*;

public class Inser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0  && arr[j]>key){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                
                j--;
            }
        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
     // for (int num : arr) {
       // System.out.print(arr);
     // }
    }
}
