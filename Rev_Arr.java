package Recursion;
import java.util.*;
public class Rev_Arr {
    public static void Rev(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int temp =arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        Rev(arr,l+1,r-1);
        
    }
    public static void main(String[] args) {
        System.out.print("Enter size : ");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n]; 
        int l = 0;
        int r = n-1;
        System.out.print("Enter elemetn : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Rev(arr,l,r);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
