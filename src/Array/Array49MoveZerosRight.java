package Array;

public class Array49MoveZerosRight {

    public static void main(String[] args) {

        int arr[] = {1, 0, 3, 0, 5, 6, 0, 8};

        int index = 0;

        // Move non-zero elements to left
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}