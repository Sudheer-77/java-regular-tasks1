package Array;

import java.util.Scanner;

public class Com8CountingnumberINArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		int count = 0;

		System.out.println("Enter array elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
     for (int i=0;i<n;i++) {
		while(arr[i]>0) {
			int rem= arr[i]%10;
			if ( rem==2)
			{
				count++;
				
			}
			arr[i]/=10;
			
		}
     }

		System.out.println("Count = " + count);
	}
}