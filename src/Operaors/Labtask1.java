package Operaors;

import java.util.Scanner;

public class Labtask1 {


	public static void main(String[] args) {
		Labtask1 l= new Labtask1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.modules ");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:System.out.println(l.sum());
		break;
		case 2:System.out.println(l.sub());
		break;
		case 3: System.out.println(l.mul());
		break;
		case 4: System.out.println(l.div());
		break;
		case 5: System.out.println(l.modules());
		default:
			System.out.println("invalid choice");
			
		}
//		l.add();
//		l.display();
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
	
//		int a=10;
//		int b=12;
//	
//		float sum = a+b;
		
//		
//		System.out.println("sum"+sum);
//		sc.nextLine();
//		float sub = a-b;
//		System.out.println("sub"+sub);
//		sc.nextLine();
//		float mul = a*b;
//		System.out.println("mul"+mul);
//		sc.nextLine();
//		float div = a/b;
//		System.out.println("div"+div);
//		sc.nextLine();
//		float reminder = a%b;
//		System.out.println("reminder"+reminder);
//		sc.nextLine();
//		 
//		int length = 12;
//		int breath = 112;
//		
//		float areaofrectangle = length*breath;
//		System.out.println("areaofrectangle"+areaofrectangle);
	
//		l.display();
		
		
	}int sum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		
		System.out.println("enter second number");
		int b=sc.nextInt();
		return a+b;
	}
	int sub() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		
		System.out.println("enter second number");
		int b=sc.nextInt();
		return a-b;
	}
//	
	int mul() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		
		System.out.println("enter second number");
		int b=sc.nextInt();
		return a*b;
	}
//	
	int div() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		
		System.out.println("enter second number");
		int b=sc.nextInt();
		return a/b;
	}
	int modules() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		
		System.out.println("enter second number");
		int b=sc.nextInt();
		return a%b;
	}
//	
//	
//	
//	 String add(){
//		int a=10;
//		int b=11;
//		int sum = a+b;
//		int sub = a-b;
//		int modules = a%b;
//		int mul = a*b;
//		float div = a/b;
//////		System.out.println("sum:"+sum);
////		System.out.println("sub:"+sub);
////		System.out.println("mul"+mul);
////		System.out.println("div"+div);
////		System.out.println("modules"+modules);
//		return sum+" "+sub+" "+modules+" "+mul;
////		
//	}
//	void display() {
//	
//		System.out.println("sum"+add());
////		System.out.println("sub"+sub);
////		System.out.println("mul"+mul);
////		System.out.println("div"+div);
//		
//		
////		System.out.println("reminder"+reminder);
////		System.out.println("******************************************");
////		System.out.println("areaofrectangle"+areaofrectangle);
//		
//	}

}
