package GUT.Sortting;

	public class InsrtionSort {
	    public static void main(String[] args) {

	        int arr[] = {10, 5, 8, 2, 7};

	        // Insertion Sort
	        for (int i = 1; i < arr.length; i++) {

	            int key = arr[i];  // Element to insert
	            int j = i - 1;

	            // Move bigger elements one position right
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            // Insert key in correct position
	            arr[j + 1] = key;
	        }

	        // Print sorted array
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}


