
public class wrapper {
	
Integer a = 100;
int b = a;

Integer c=b;


	public static void main ( String args[])
	{
		wrapper w= new wrapper();
		System.out.println(w.a);
		System.out.println(w.b);
		System.out.println(w.c);
	}
}
