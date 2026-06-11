package typesOfMethods;
import java.util.*;

public class Methods {
	int count=0;
	void add()
	{
		int a= 12;
		int b = 11;
		int c = a+b;
		System.out.println(c);
		System.out.println("\n");
		count++;
	}
	void add1(int d, int e)
	{
		 int add1 = d+e;
		 System.out.println(add1);
			System.out.println("\n");
			count++;

	}

	void  add2(int x,int y,int z)
	{
		int add2 =x+y+z; 
		System.out.println(add2);
		System.out.println("\n");
		count++;
	}
	void sub()
	{
		int a= 19;
		int b=10;
		int sub = a-b;
		System.out.println(sub);
		System.out.println("\n");
		count++;
	}
	void sub2(int d, int e)
	{
		 int sub2 = d-e;
			System.out.println(sub2);
			System.out.println("\n");
			count++;
	}
	void  sub3(int x,int y,int z)
	{
		int sub3 =(x-y)-z; 
		System.out.println(sub3);
		System.out.println("\n");
		count++;
	}
	
	
	void mul()
	{
		int a= 12;
		int b = 11;
		int c = a*b;
		System.out.println(c);
		System.out.println("\n");
		count++;
	}
	void mul1(int d, int e)
	{
		 int mul1 = d*e;
			System.out.println(mul1);
			System.out.println("\n");
			count++;
	}

	void  mul2(int x,int y,int z)
	{
		int mul2 =x*y*z; 
	
		System.out.println(mul2);
		System.out.println("\n");
		count++;
	}
	 void name()
	 {
		 String name = " sudheer";
			System.out.println("\n");
			count++;
	 }
	 void name2(char a, char b)
	 
	 {
		 
		 
			System.out.println("\n");
			count++;
	 }
	 
	 
public static void main(String args[]) {
	
	Methods A = new Methods();
	System.out.println(" enter number");
	Scanner sc = new Scanner(System.in);

 A.add();
int a = sc.nextInt();
int b = sc.nextInt();
//A.add2(a,b);
A.add1(12,12);
A.add2(10,11,12);

A.sub();
A.sub2(111,12);
A.sub3(121,212,21);

A.mul();
A.mul1(12,12);
A.mul2(10,11,12);

A.name();
A.name2('s','j');

System.out.println(A.count);

	}

}
