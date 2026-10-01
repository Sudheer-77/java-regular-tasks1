package Java8Features;

interface In4 {
	void hello(String name);
}

public class TestJ8demo4 {

	public static void main(String[] args) {
		In4 i3 = str -> System.out.println("Hello Mr/mrs : " + str);
		i3.hello("Sudheer THE KING");
	}

}