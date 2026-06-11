package typesOfMethods;

import java.util.Scanner;

public class Myfavroutmethods {
	String food;
	int number;
	double height;
	float weight;
	String colour;
	String car;
	
	 Myfavroutmethods fav()
	 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter your fav food :");
		 this. food = sc.nextLine();
		 System.out.println("enter your fav number :");
		 this. number = sc.nextInt();
		 System.out.println(" enter your fav colour :");
		 sc.nextLine();
		 this.colour = sc.nextLine();
		 System.out.println("enter  your hight :");
		 this. height = sc.nextDouble();
		 System.out.println("enter  your weight :");
		 this.weight = sc.nextFloat();
		 sc.nextLine();
		 System.out.println("enter your fav car :");
		 this. car = sc.nextLine();
		 return this ;
		
	}

	 public static void main(String[] args) {
	
		Myfavroutmethods obj = new Myfavroutmethods();
		obj.fav();
		 System.out.println("enter your fav food :" +obj.food);
		 System.out.println("enter your fav number :" + obj.number);
		 System.out.println(" enter your fav colour :" + obj.colour);
		 System.out.println("enter  your hight :" + obj.height);
		 System.out.println("enter  your weight :" +obj.weight);
		 System.out.println("enter  your weight :" +obj.car);
	}

}
