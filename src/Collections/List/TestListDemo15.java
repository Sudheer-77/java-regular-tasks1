package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListDemo15 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
//set will replace the value.
		//6,99,786,100,108,118,158
		l1.add(6);
		l1.add(99);
		l1.add(108);
		l1.add(118);
		l1.add(158);
		l1.set(2, 786);
		l1.set(3, 100);
//		l1.remove(l1.indexOf(6));
//
//		Iterator<Integer> itr = l1.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		System.out.println("-------------------------");

		ListIterator<Integer> litr = l1.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("*******************************");
		while (litr.hasPrevious()) {
			
			System.out.println(litr.previous());
		}

		l1.remove(l1.indexOf(6));// IndexOutOfBoundException
//		System.out.println(l1);

	}

}