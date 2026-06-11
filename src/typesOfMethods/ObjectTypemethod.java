package typesOfMethods;

import java.util.Scanner;

public class ObjectTypemethod {
	int id;
	int marks;
	String name;

	public static void main(String[] args) {
	
		System.out.println(" main methos started ");
		ObjectTypemethod D = new ObjectTypemethod();
		D. details();
		 System.out.println("ID    : " + D.id);
	        System.out.println("Marks : " + D.marks);
	        System.out.println("Name  : " + D.name);
		System.out.println("main methos closed");


	}
	 ObjectTypemethod details() {
//		ObjectTypemethod D = new ObjectTypemethod();
		Scanner sc = new Scanner(System.in);
		System.out.println(" ENTER ID : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter  marks");
		 marks = sc.nextInt();
		sc.nextLine();
		System.out.println("enter name : ");
		name = sc.nextLine();

	return  this;
	}
	

	
	
}

