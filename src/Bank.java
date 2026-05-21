
public class Bank {
	static int accno = 1234560;
	 static int serial = 100;
	 {
		 serial++;
		 accno++;
	 }
	String name ;
	float balance ;
	long mobile ;

	
	void display()
	{
		System.out.println("name :" +name);
		System.out.println("balance :"+balance);
		System.out.println("mobile :"+mobile);
		System.out.println("serial :"+serial);
		System.out.println("accno:"+accno);
		System.out.println("\n");
		
	

	}

	public static void main (String args [])
	{
		Bank b= new Bank();
		b.name = "sudheer";
		b.balance =1000;
		b.mobile =7897;
		
		Bank b1= new Bank();
		b1.name = "roith";
		b1.balance =100023;
		b1.mobile =789227;
		
		Bank b2= new Bank();
		b2.name = "kumar";
		b2.balance =1220;
		b2.mobile =789347;
		
		
		b.display();
		b1.display();
		b2.display();
	}
	
}
