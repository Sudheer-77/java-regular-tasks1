package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo17 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
//		10,30,20,5,60,40,40,50,60

		l1.add(10);
		l1.add(30);
		l1.add(20);
		l1.add(60);
		l1.add(40);
		l1.add(3,5);
		l1.add(40);
		l1.add(50);
		l1.add(60);

		System.out.println(l1);

       List<Integer> l2 = l1.subList(4, 7);
		System.out.println(l2);
		l2.add(100);
		l2.add(200);
		l2.remove(1);


	}

}