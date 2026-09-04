package Main2;

//Bubble sort 

 
import java.util.*;
public class Sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size :");
    int n = sc.nextInt();
    int arr[] = new int [n];
    for(int i =0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]);
    }
    System.out.println();
     for(int i=n-1;i>=0;i--){
        int count =0;
        for(int j=0;j<i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
                count++;
            }
            if(count==0){
                break;
            }
        }
    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+ " ");
    }


  }  
}
