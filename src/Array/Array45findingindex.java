package Array;

import java.util.Scanner;

public class Array45findingindex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Enter element: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == key) {

                    System.out.println("Index = [" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }

            if (found)
                break;
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}