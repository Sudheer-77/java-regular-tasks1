package Array;

import java.util.Arrays;

public class array21Bobulsort {

	public static void main(String[] args) {

		int arr[] = { 12, 33, 4, 5, 6, 7868, 89 };

		for (int i = 0; i < arr.length - 1; i++) {

			boolean swap = false;

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					swap = true;
				}
			}

			if (!swap) {
				break;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}