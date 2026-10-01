package Java8Features;

abstract class Test1 {
	abstract void method1();

	abstract void method2();
}

public class AnnomousInnerclass {

	public static void main(String[] args) {

//		Anonymous Inner class extends Test1 abstract class 
		Test1 t1 = new Test1() {
			@Override
			void method1() {
				System.out.println("method1 called ");
			}

			@Override
			void method2() {

			}
		};

		t1.method1();

	}
}