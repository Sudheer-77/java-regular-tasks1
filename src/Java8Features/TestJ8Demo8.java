package Java8Features;

//Functional interface WRT inheritance 

@FunctionalInterface
interface In8 {
	void method1();
}

@FunctionalInterface
//CE : Invalid '@FunctionalInterface' annotation; In9 is not a functional interface
interface In9 extends In8 {
//	void method2();// IF THERE IS ANY 2ND METHOD THEN IT WILL NOT BE CONSIDE AS FUNCIONAL INTERFACE
}

public class TestJ8Demo8 {

	public static void main(String[] args) {
		In9 i8 = () -> {
			System.out.println("hello method1 ");
		};

		i8.method1();
	}
}