package Array;

import java.util.Scanner;

public class Com11replacingNumber {

    public static void main(String[] args) {

        int arr[] = {12, 122, 32, 34, 54, 6};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to replace:");
        int n = sc.nextInt();

        boolean found = false;

        // Check if the number exists
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                found = true;
                break;
            }
        }

        if (found) {

            System.out.println("Enter the replacement number:");
            int m = sc.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n) {
                    arr[i] = m;
                }
            }

            System.out.println("Array after replacement:");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        } else {
            System.out.println("Entered number not found.");
        }

        sc.close();
    }
}