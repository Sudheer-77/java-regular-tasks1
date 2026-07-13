package Array;

import java.util.Scanner;

public class Com162DArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println(" enter row size");
		int n = sc.nextInt();
		System.out.println("Enter coloums size");
		int m = sc.nextInt();
		int arr[][]=new int[n][m];
		System.out.println(" Enter array elements:");
		for (int i=0;i<arr.length;i++)
		{
			for (int j = 0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		   System.out.println("2D Array:");

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
			

	}

}
