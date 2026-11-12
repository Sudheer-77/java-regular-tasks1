package Array;


public class Array74sumOfnextNelements {
    public static void main(String[] args) {

        int[] arr = {5, 7, 1, 4};
        int k = 2;

        int n = arr.length;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = 1; j <= k; j++) {

                int index = (i + j) % n;

                sum = sum + arr[index];
            }

            result[i] = sum;
        }

        // Print result array
        System.out.print("Output: ");

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
