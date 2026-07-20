package Array;
public class Array52RotateAntiClockwise {

    public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = arr.length;

        // Step 1: Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each column not row
        for (int j = 0; j < n; j++) {

            int top = 0;
            int bottom = n - 1;

            while (top < bottom) {

                int temp = arr[top][j];
                arr[top][j] = arr[bottom][j];
                arr[bottom][j] = temp;

                top++;
                bottom--;
            }
        }

     
        System.out.println("90 Degree Anti-Clockwise Rotation:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}