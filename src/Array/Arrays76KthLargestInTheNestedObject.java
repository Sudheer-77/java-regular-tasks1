
package Array;

import java.util.Arrays;

class Main {

    // Extract integers from nested arrays
    static void extract(Object[] arr, int[] result, int[] index) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] instanceof Integer) {

                result[index[0]] = (Integer) arr[i];
                index[0]++;

            } else if (arr[i] instanceof Object[]) {

                // Call the same method for nested arrays
                extract((Object[]) arr[i], result, index);
            }
        }
    }

    public static void main(String[] args) {

        Object[] arr = {
            10,
            new Object[]{20, 90},
            40,
            new Object[]{50, new Object[]{60, 70}}
        };

        int[] result = new int[7];
        int[] index = {0};

        extract(arr, result, index);

        // Sort in ascending order
        Arrays.sort(result);

        System.out.println("Sorted array: " + Arrays.toString(result));

        int k = 3;
        int count = 0;
        int previous = Integer.MIN_VALUE;

        // Traverse from largest to smallest
        for (int i = result.length - 1; i >= 0; i--) {

            if (count == 0 || result[i] != previous) {

                count++;
                previous = result[i];

                if (count == k) {
                    System.out.println("Kth largest: " + result[i]);
                    break;
                }
            }
        }
    }
}
