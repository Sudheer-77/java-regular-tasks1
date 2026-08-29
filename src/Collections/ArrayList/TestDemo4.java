package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo4 {

	public static void main(String[] args) {
	Collection <Integer>c1= new ArrayList();
	System.out.println(c1);
	Collection <Integer>c2= new ArrayList();
	System.out.println(c2);
	System.out.println(c1.equals(c2));
	System.out.println("**************************************");
	Collection <Integer>C3= new ArrayList();
	C3.add(10);
	C3.add(20);
	Collection <Integer>C4= new ArrayList();
	C4.add(20);
	C4.add(10);
	System.out.println(C3.equals(C4));

	}

}
