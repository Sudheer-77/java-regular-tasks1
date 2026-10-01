package Java8Features;

@FunctionalInterface
interface In7 {
	String welcome(String fname, String lname);
}

public class TestJ8demo7 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		In7 t7 = (f, l) -> f + l;
		System.out.println("Welcome Mr Captain Cool : " + t7.welcome("Mahendra singh", "Dhoni"));
		System.out.println("main method ended !!");
	}
}