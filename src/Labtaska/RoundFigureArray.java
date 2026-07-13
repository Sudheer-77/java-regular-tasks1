package Labtaska;
import java.util.Scanner;

public class RoundFigureArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Rounded numbers:");

        for (int i = 0; i < n; i++) {

            int remainder = arr[i] % 10;

            switch (remainder) {

                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println(arr[i] - remainder);
                    break;

                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(arr[i] + (10 - remainder));
                    break;
            }
        }

        sc.close();
    }
}