package Labtaska;
import java.util.Scanner;

public class ZigZagNonPrime {

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {

            int arr[] = new int[i];
            int count = 0;

            while (count < i) {
                if (!isPrime(num)) {
                    arr[count++] = num;
                }
                num++;
            }

            if (i % 2 == 1) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
    }
}