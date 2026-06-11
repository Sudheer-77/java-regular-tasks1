package typesOfMethods;
import java.util.*;

public class Hospitalmanagment {

 void main(String[] args) {
	 Hospitalmanagment H =new Hospitalmanagment();
	 Scanner sc = new Scanner (System.in);
	 System.out.println("enter  hospital name :");
	 String name = sc.nextLine();
	  H.hospitalname(name);
	  
	  System.out.println("enter your name ");
	  String name1 = sc.nextLine();
	  H.getPatientName(name1);
	  
	  
	  System.out.println("enter your age");
	  int age = sc.nextInt();
	  H.getPatientAge(age);
	  
	  
	  System.out.println("enter blood group");
	  String bloodgroup = sc.nextLine();
	  H.getBloodGroup(bloodgroup);
	  
	  
	   System.out.println("enter your weight");
	  double weight = sc.nextDouble();
	 H.getPatientWeight( weight);
	  
	  System.out.println("enter your hight");
	  float hight = sc.nextFloat();
	  H.getPatientHeight( hight);
		
//	 getPatientName(String name)
//	 getPatientAge(int age)
//	 getBloodGroup(String bloodGroup)
//	 getPatientWeight(double weight)
//	 getPatientHeight(float height)
	}
void hospitalname(String name)
{
	System.out.println("Hospital name is " + name);
}
void getPatientName(String name1)
{
	System.out.println(" patient name is :"+name1);
}
void getPatientAge( int age)
{
	System.out.println("patient age is :"+ age);
}
void getBloodGroup(String bloodGroup)
{
	System.out.println("Blood group is :"+ bloodGroup);
}
  void getPatientWeight(double weight)
  {
	  System.out.println(" patient weight is :" + weight);
  }
  void getPatientHeight(float hight)
  {
	  System.out.println(" patient hight is :" + hight );
  }
}
