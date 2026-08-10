package Array;

public class Array56MergTwoArray {

	public static void main(String args[]) {

		int arr[] = { 12, 23, 34, 56, 7 };
		int arr2[] = { 1, 2, 4, 5 };

		int arr3[] = new int[arr.length + arr2.length];

		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			arr3[k++] = arr[i];
		}

		for (int j = 0; j < arr2.length; j++) {
			arr3[k++] = arr2[j];
		}

		for (int i = 0; i < arr3.length - 1; i++) {
			for (int j = 0; j < arr3.length - 1 - i; j++) {
				if (arr3[j] > arr3[j + 1]) {
					int temp = arr3[j];
					arr3[j] = arr3[j + 1];
					arr3[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}