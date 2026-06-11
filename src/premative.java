
public class premative {
	
	byte age;
	 short year ;
	 int salary;
	 boolean eligible= false;
	 void display() 
	 {
		 System.out.println("age :"+ age);
		 System.out.println("year :"+ year);
		 System.out.println("eligible :"+ eligible);
		 System.out.println("salary :" +salary);
	 System.out.println("\n");
	 }
public static void main(String args[]) {
	
	premative c=new premative();
	c.age =20;
	c.year =2026;
	c.salary = 100000;
	c.eligible = true;
	
	premative c1=new premative();
	c1.age =21;
	c1.year =2025;
	c1.salary = 100000;
	c1.eligible = true;
c.display();
c1.display();

	
}
}

