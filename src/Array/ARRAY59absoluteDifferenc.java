package Array;

public class ARRAY59absoluteDifferenc {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 3, 19, 18, 25 };

		int min = Integer.MAX_VALUE;
		int first = 0;
		int second = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int difference = Math.abs(arr[i] - arr[j]);

				if (difference < min) {
					min = difference;
					first = arr[i];
					second = arr[j];
				}
			}
		}

		System.out.println("[" + first + ", " + second + "]");
	}
}