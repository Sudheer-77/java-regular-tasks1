package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo14 {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();

		//400,100,200,300,400,0,890,7,6,34,

		l1.add(400);
		l1.add(1, 100);
		l1.add(2, 200);
		l1.add(3,0);
		l1.add(4,7);
		l1.add(890);
		l1.add(34);
		l1.add(5,6);
		
		l1.add(3, 300);
		l1.add(4, 400);
		System.out.println(l1);

	}

}
