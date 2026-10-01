package Java8Features;

@FunctionalInterface
interface In6 {
	int addition(int x, int y);
}

public class TestJ8demo6 {

	public static void main(String[] args) {

		In6 i = (n, m) -> {
			return n + m;
		};
		System.out.println(i.addition(10, 20));
	}
}