package Array;

public class Array33Reversewithoutanotherarray {

	public static void main(String[] args) {
	int arr[]= {12,12,23,34,4,5,1};
	System.out.println("original array ");
	for(int i=0;i<arr.length;i++) {

		System.out.print(arr[i]+" ");
	}
	System.out.println(" ");
System.out.println("****************************");

	for (int i =arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}

	}

}
