package typesOfMethods;

import java.util.Scanner;

public class Studentmethods {
	int id;
	String name;
	String course;

	
	Studentmethods(){
		int id;
		String name;
		String course;
		display();
	
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 Studentmethods s = new  Studentmethods();
			System.out.println("enter your id:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("enter your name :");
			String name = sc.nextLine();
			System.out.println("enter your cource :");
			String course = sc.nextLine();
		 s.display();
		 
		

	}
void display(){
	System.out.println("enter your id is:" + id);
	System.out.println("enter your name  is:" + name);
	System.out.println("enter your id course:" + course);
	
}
}
