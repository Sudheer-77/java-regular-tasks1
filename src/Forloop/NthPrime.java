package Forloop;

import java.util.Scanner;

public class NthPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        while (true) {

            if (isPrime(num)) {
                count++;

                if (count == n) {
                    System.out.println("The " + n + "th prime number is: " + num);
                    break;
                }
            }

            num++;
        }
    }

    private static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}