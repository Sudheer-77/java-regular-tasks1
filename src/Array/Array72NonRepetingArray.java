package Array;

public class Array72NonRepetingArray {

	public static void main(String[] args) {
		int arr[]=  {4, 5, 1, 2, 1, 4, 5};
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {

		    boolean repeat = false;

		    for (int j = 0; j < arr.length; j++) {

		        if (i != j && arr[i] == arr[j]) {
		            repeat = true;
		            break;
		        }
		    }

		    if (repeat == false) {
		        System.out.println("First non-repeating element: " + arr[i]);
		        break;
		    }
		}
		}

	}


