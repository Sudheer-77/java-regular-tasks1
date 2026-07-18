package Array;

public class Array42Countpositiveandnegativenumbers {

    public static void main(String[] args) {

        int arr[][] = {
                {1, -2, 3},
                {-4, 5, -6},
                {7, -8, 9}
        };

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > 0) {
                    positive++;
                } else if (arr[i][j] < 0) {
                    negative++;
                }
            }
        }

        System.out.println("Positive Numbers = " + positive);
        System.out.println("Negative Numbers = " + negative);
    }
}