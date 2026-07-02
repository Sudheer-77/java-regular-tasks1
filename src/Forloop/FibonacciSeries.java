package Forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int n = 0;
		int n1 = 1;
		//System.out.println(n + " " + n1 + " ");
		for (int i = 1; i <=num; i++) {
			System.out.println(n + " ");
			int n2 = n + n1;

			n = n1;
			n1 = n2;
		}

	}

}
