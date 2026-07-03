package Labtaska;

import java.util.Scanner;

public class Findingcharacter {
	public static void main (String args[]) {
		Findingcharacter f = new Findingcharacter();
		Scanner sc = new Scanner(System.in);
		char ch =sc.next().charAt(0);

		
		if (ch>='a'&& ch>='z') {
			System.out.println("lower case");
			
		}
		else if(ch>='A'&& ch>='z') 
		{
			System.out.println("UPPER CASE");
		}
		else if(ch>='0'&& ch>='9') 
		{
			System.out.println("numbers");
		}
		else
		{
			System.out.println("special char");
		}
	}

}
