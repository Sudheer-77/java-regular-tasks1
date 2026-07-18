package Array;

public class Array47Matrixsubtraction {

    public static void main(String[] args) {

        int arr1[][] = {
                {5, 6, 7},
                {8, 9, 10}
        };

        int arr2[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int result[][] = new int[arr1.length][arr1[0].length];

        // Subtraction
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[0].length; j++) {

                result[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        // Print Result
        System.out.println("Result Matrix:");

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result[0].length; j++) {

                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }
}