package Array;

public class Array57possibleCombinations {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        int[] combination = new int[arr.length];

        generate(arr, combination, 0, 0);
    }

    static void generate(int[] arr, int[] combination, int index, int size) {

        // Print current combination
        System.out.print("[");

        for (int i = 0; i < size; i++) {
            System.out.print(combination[i]);

            if (i < size - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        // Generate combinations
        for (int i = index; i < arr.length; i++) {

            // Add element
            combination[size] = arr[i];

            // Recursive call
            generate(arr, combination, i + 1, size + 1);
        }
    }
}