package Array;
public class Array53Symmetricmatrics {

    public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 4, 6}
        };

        int n = arr.length;
        boolean symmetric = true;

        // Check only upper triangle
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i][j] != arr[j][i]) {
                    symmetric = false;
                    break;
                }
            }

            if (!symmetric)
                break;
        }

        if (symmetric)
            System.out.println("Matrix is Symmetric");
        else
            System.out.println("Matrix is Not Symmetric");
    }
}