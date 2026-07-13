package Array;

import java.util.Arrays;

public class Array22SelectionSort {

    public static void main(String[] args) {

        int arr[] = {64, 25, 12, 22, 11};

        // Outer loop - controls the passes
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume current element is the minimum
            int min = i;

            // Find the smallest element in the remaining array
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap the smallest element with the current element
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}