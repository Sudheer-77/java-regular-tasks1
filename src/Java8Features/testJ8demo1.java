//GENERALLY WE WRITE THE INTERFACE  ABSTRACT METHOD IN THIS WAY .BUT!!!!!!
//package Java8Features;
//
//interface In1 {
//	void hello();
//}
//
//class test1 implements In1 {
//	@Override
//	public void hello() {
//		System.out.println(" hello welcome back");
//	}
//}
//
//public class testJ8demo1 {
//
//	public static void main(String[] args) {
//		test1 t= new test1();
//		t.hello();
//
//	}
//
//}
//


// FROM LAMDA EXPRESSION THERE WILL BW A SMALL CHANGE WE WILL SEE IT NOW IN BWLOW........





package Java8Features;
@FunctionalInterface

interface In1 {
	public abstract void hello();
}

public class testJ8demo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		In1 t= () ->System.out.println(" hello welcome back");
		t.hello();
		System.out.println(" main method ened");
		}

	}




