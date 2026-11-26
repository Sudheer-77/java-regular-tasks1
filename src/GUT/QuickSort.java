package GUT;
import java.util.Arrays;

public class QuickSort {

	

	    static void quickSort(int arr[], int low, int high) {
	        if (low >= high) {    
	            return;
	        }

	        int pivot = arr[low];
	        int i = low;
	        int j = high;

	        while (i < j) {

	            while (i < j && arr[j] > pivot) {
	                j--;
	            }

	            while (i < j && arr[i] <= pivot) {
	                i++;
	            }

	            if (i < j) {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        arr[low] = arr[i];
	        arr[i] = pivot;

	        quickSort(arr, low, i - 1);
	        quickSort(arr, i + 1, high);
	    }

	    public static void main(String[] args) {
	        int arr[] = {10, 7, 8, 9, 1, 5};

	        quickSort(arr, 0, arr.length - 1);

	        System.out.println(Arrays.toString(arr));
	    }
	}


