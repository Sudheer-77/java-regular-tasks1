package Labtaska;

import java.util.Scanner;

public class zigzagOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int n1 = 1;
		for (int i = 1; i<n;i++) {
			boolean prime = isPrime(i);
			if (!prime) {

				for (int j = 1; j <= n1; j++) {
					System.out.print(i+" ");
					i++;
				}
				n1++;

				System.out.println();
			}

		}
	}

	public static boolean isPrime(int n) {

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
