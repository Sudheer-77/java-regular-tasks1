public class Array53maxofarray {

    public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maxSum = Integer.MIN_VALUE;
        int rowIndex = -1;

        // Calculate sum of each row
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " Sum = " + sum);

            if (sum > maxSum) {
                maxSum = sum;
                rowIndex = i;
            }
        }

        System.out.println("\nMaximum Sum = " + maxSum);
        System.out.println("Maximum Sum Row = " + (rowIndex + 1));
    }
}