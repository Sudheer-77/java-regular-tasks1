package typesOfMethods;
import java.util.*;

public class Studentinfo {

	public static void main(String[] args) {
		Studentinfo s = new Studentinfo();
		Scanner sc = new Scanner (System.in);
		System.out.println("wel come ");
		sc.nextLine();
		System.out.println("enter yput name :");
		String name = sc.nextLine();
		s.Name(name);
		
		System.out.println("enter age :");
		int age = sc.nextInt();
		s.getage(age);
		//roonumner, marks grade;
		System.out.println("enter roll number : ");
		long rollnumber = sc.nextInt();
		System.out.println("enter marks :");
		int marks = sc.nextInt();
		System.out.println("Grade is :");
		String grade = sc.next();
		s.getmarks(rollnumber, marks, grade);
		
	}
		
		void Name(String name) {
			System.out.println("Name of the Student  :" + name);
		}
		void getage(int age)
		{
			System.out.println("Age of the student is "+age);
		}
		void getmarks(long
				rollnumber,int marks,String grade)
		{
			System.out.println("Roll number of Student is ;" +rollnumber);
			System.out.println("Marks of student is  :" +marks);
			System.out.println("Grade of Student is  :" +grade);
		}
		
	

}
