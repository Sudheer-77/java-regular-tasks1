package Labtaska;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		
		Evenorodd ev=new Evenorodd();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println("enter number is even");
		}
		else
		{
			System.out.println("enterd number is odd");
		}
	}

}
