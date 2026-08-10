package Array;

public class ArrayMaxSubArray {

    public static void main(String[] args) {

        int arr[] = {1, 0, 1, 2, 3, 4, 0, 6, 7, 8};

        int count = 0;
        int max = 0;
        int start = 0;
        int maxStart = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                
                if (count == 0) {
                    start = i;
                }

                count++;

         
                if (count > max) {
                    max = count;
                    maxStart = start;
                }

            } else {
                count = 0;
            }
        }

        System.out.println("Maximum consecutive non-zero elements = " + max);

        System.out.print("Longest subarray: ");
        for (int i = maxStart; i < maxStart + max; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}