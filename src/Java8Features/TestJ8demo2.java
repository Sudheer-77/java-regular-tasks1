package Java8Features;
interface In2{
	public abstract void sum( int a,int b);
}

public class TestJ8demo2 {

	public static void main(String[] args) {
		System.out.println(" main method stated");
		In2 T= (c,v)->
			System.out.println("sum is :"+(c+v));
			
		T.sum(10, 12);
		System.out.println(" main method ended");

	}

}
