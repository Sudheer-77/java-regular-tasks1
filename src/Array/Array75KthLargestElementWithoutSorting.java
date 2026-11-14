package Array;


public class Array75KthLargestElementWithoutSorting {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};
        int k = 2;

        int largest = Integer.MIN_VALUE;

        for (int count = 1; count <= k; count++) {

            largest = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }

            // Mark the selected element as used
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == largest) {
                    arr[i] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        System.out.println("Kth Largest = " + largest);
    }
}
