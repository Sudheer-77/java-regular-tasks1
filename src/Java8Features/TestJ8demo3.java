package Java8Features;

@FunctionalInterface
interface In3 {
	public abstract void multiplication(int a, int b);

	default void add() {
		System.out.println(" default methosd called");
	}

}

public class TestJ8demo3 {

	public static void main(String[] args) {
		System.out.println(" main methos started");

		In3 T = (c, v) -> System.out.println(" multiplication is: " + (c * v));
		T.multiplication(10, 8);
		T.add();

	}

}
