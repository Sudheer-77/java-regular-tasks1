package Labtaska;

public class LeftRotatatryArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int n = 3;

		leftRotate(arr, n);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void leftRotate(int arr[], int n) {
		n = n % arr.length;

		for (int k = 1; k <= n; k++) {
			int first = arr[0];

			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}

			arr[arr.length - 1] = first;
		}
	}
}