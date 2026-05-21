public class Main{
	static void subject()
	{
		System.out.println("telugu");
	}
	static void subject2()
	{
		Main m = new Main();
		m.sub4();
		System.out.println("hindi");
	}
	
	void sub3()
	{
		 //subject();
		sub4();
		System.out.println("english");
		
	}
	void sub4() {
		System.out.println("maths");
		System.out.println("hi maths 2");
	}
	
	public static void main (String []args ) {
		Main m = new Main();
		m.sub3();
		subject2();
		subject();
	}
	
	
	
	
	
}