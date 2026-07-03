package Labtaska;

import java.util.Scanner;

public class Switch {

	public static void main(String []args)
	{
		Switch s=new Switch();
		Scanner sc= new Scanner(System.in);
		 int category;
		
			do {
				 System.out.println("1.gold");
				 System.out.println("2.platinum");
				 System.out.println("3.valuable");
				 System.out.println("4.exit");
				 System.out.println("select value");
				 
				 category=sc.nextInt();
			 
				 switch (category)
				 {
				 case 1->System.out.println("150");
				 case 2->System.out.println("250");
				 case 3->System.out.println("400");
				 default->System.out.println("Invalid Choice");
					 
				 }
				 
			 }while(category != 4);
		
	}
}



























