package Array;

import java.util.Arrays;

public class Array70NextGreaterElementinCircularArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};

        int n = arr.length;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            result[i] = -1;

            for (int j = 1; j < n; j++) {

                int index = (i + j) % n;

                if (arr[index] > arr[i]) {
                    result[i] = arr[index];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(result));
    }
}