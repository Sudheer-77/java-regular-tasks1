package typesOfMethods;
import java.util.*;

public class Clginformation {

	public static void main(String[] args) {
		//College Information
//		getCollegeName(String college)
//		getCollegeLocation(String location)
//		getTotalStudents(int count)
//		getCollegeRanking(int rank)
//		getCollegeFee(double fee)
		
		Clginformation c = new Clginformation();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your collage name ");
	    String name = sc.nextLine();
		c.getCollegeName(name);
		
		System.out.println("enter your clg location");
		String location = sc.nextLine();
		c.getCollegeLocation(location);
		System.out.println("enter total number of students :");
		int number = sc.nextInt();
		c.getTotalStudents(number);
		System.out.println("enter your collage rank :");
		int rank = sc.nextInt();
		c. getCollegeRanking(rank);
		System.out.println("enter your colage fee :");
		double fee = sc.nextDouble();
		c.getCollegeFee( fee);
	}
	void getCollegeName(String name)
	{
		System.out.println("Collage name is "+ name);

	}
	 void getCollegeLocation(String location)
	 {
		 System.out.println("Collage location is :" +location);
	 }
	 void getTotalStudents(int number)
	 {
		 System.out.println("Total number of students in your collsge is :" +number);
	 }
	 void getCollegeRanking(int rank)
	 {
		 System.out.println(" Rank of the collage is :" + rank);
	 }
	 void getCollegeFee(double fee)
	 {
		 System.out.println("Collage fee is :"+ fee);
	 }

}
