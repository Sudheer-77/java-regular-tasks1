public class Array24maxinRow {

    public static void main(String[] args) {

        int[][] arr = {
            {10, 25, 3},
            {45, 12, 18},
            {7, 90, 15}
        };

        for (int i = 0; i < arr.length; i++) {

            int max = arr[i][0];  

            for (int j = 1; j < arr[i].length; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

            System.out.println("Maximum element in Row " + (i + 1) + " = " + max);
        }
    }
}