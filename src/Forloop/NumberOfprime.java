package Forloop;

import java.util.Scanner;

public class NumberOfprime {

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many prime numbers do you want? ");
        int n = sc.nextInt();

        int count = 0;

        for (int num = 2; count < n; num++) {

            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
        }

        sc.close();
    }
}