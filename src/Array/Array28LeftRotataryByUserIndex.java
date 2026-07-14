package Array;

import java.util.Scanner;

public class Array28LeftRotataryByUserIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Enter array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Enter number of rotations
        System.out.print("Enter left rotation value (k): ");
        int k = sc.nextInt();

        // If k is greater than array length
        k = k % n;

        // Rotate left k times
        for (int r = 0; r < k; r++) {

            int first = arr[0];

            // Shift elements to the left
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Place first element at the end
            arr[n - 1] = first;
        }

        // Print rotated array
        System.out.println("Array after left rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
} 