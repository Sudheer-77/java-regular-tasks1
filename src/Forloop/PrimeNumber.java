package Forloop;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Entered number is Not Prime");
        } else {

            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("Entered number is Prime");
            } else {
                System.out.println("Entered number is Not Prime");
            }
        }

        sc.close();
    }
}


//
//package Forloop;
//
//import java.util.Scanner;
//
////2 3 5 7 11 13 .....
//public class PrimeNumber {
//
//	boolean isPrime(int n) {
//		boolean status = true;
//		if (n == 0 || n == 1) {
//			return false;
//		}
//
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				status = false;
//				break;
//			}
//		}
//
//		return status;
//	}
//
//	void main() {
//		System.out.println("main method started ");
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("How many prime number you want to print ..? : ");
//		int n = sc.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			if (isPrime(i)) {
//				System.out.print(i + " ");
//			}
//		}
//	}
//
//}