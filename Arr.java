package Main1;
import java.util.*;
/* Find array frequency  */
public class Arr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int arr[] =new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int count =1;
        for(int i=0;i<n-1 ;i++){
            if ( arr[i]==arr[i+1]){
                count++;
            }
            else{
                System.out.println(arr[i] +"--->  "+ count );
                count=1;
            }
          
        }
        System.out.println(arr[n-1] +"---->"+ count );
    }
}
