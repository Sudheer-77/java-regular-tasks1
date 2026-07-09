package Array;

import java.util.Scanner;

public class Com6serchingAnElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an element to search: ");
		int n = sc.nextInt();

		int[] arr = { 12, 21, 23, 43, 54 };

		boolean found = false;

		for (int i = 0; i < arr.length; i++) {

			if (n == arr[i]) {
				System.out.println("Element found: " + arr[i]);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Element is not there");
		}

		sc.close();
	}
}