package Array;

import java.util.Scanner;

public class Com10searchinganELEMENT {

	public static void main(String[] args) {
	
		int num []= {12,122,34,5,6};
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number to search");
		int n = sc.nextInt();
		for (int i=0;i<num.length;i++)
		{
			if(num[i]==n)
			{
				System.out.println(" number  found"+n);
				System.out.println(" index is :"+num[i]);
			}
		}
		

	}

}
