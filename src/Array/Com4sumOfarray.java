package Array;

import java.util.Scanner;

public class Com4sumOfarray {
	public static void  main (String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int sum= 0;
		
		int [] arr= new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum= sum+ arr[i];
		}
		for(int i=0;i<n;i++)
		{
			
			sum= sum+ arr[i];
		}
		System.out.println("sum of array is"+ sum);
		
	}

}
