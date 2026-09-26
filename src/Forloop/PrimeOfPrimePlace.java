package Forloop;

import java.util.Scanner;

public class PrimeOfPrimePlace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int position = 1;
        int num = 2;

        while (position <= n) {

            if (isPrime(num)) {

                // Check whether the position is prime
                if (isPrime(position)) {
                    System.out.println(
                        "Position " + position + " : " + num
                    );
                }

                position++;
            }

            num++;
        }

        sc.close();
    }

    // Method to check prime
    private static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}








































//package Forloop;
//
//import java.util.Scanner;
//
//public class PrimeOfPrimePlace {
//
//    public static void main(String[] args) {
//
//        int num = 2;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a number:");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//
//            if (isPrime(num)) {
//
//                System.out.println(i + " : " + num);
//
//                // Move to the next number
//                num++;
//            }
//        }
//
//        sc.close();
//    }
//
//    private static boolean isPrime(int num) {
//
//        if (num <= 1) {
//            return false;
//        }
//
//        int count = 0;
//
//        // Check divisibility
//        for (int i = 1; i <= num; i++) {
//
//            if (num % i == 0) {
//                count++;
//            }
//        }
//
//        // Prime number has exactly 2 factors
//        return count == 2;
//    }
//}