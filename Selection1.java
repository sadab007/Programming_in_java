package Main2;
import java.util.*;

public class Selection1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++) {

            int minIndex = i;

            System.out.println("\nPass " + (i + 1));
            System.out.println("Current position: " + i);

            for(int j = i + 1; j < n; j++) {

                System.out.println(
                    "Comparing " + arr[j] +
                    " and " + arr[minIndex]
                );

                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                    System.out.println(
                        "New minimum found: " + arr[minIndex]
                    );
                }
            }

            System.out.println(
                "Swapping " + arr[i] +
                " and " + arr[minIndex]
            );

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.print("Array after pass " + (i + 1) + ": ");

            for(int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

        System.out.print("\nFinal Sorted Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}