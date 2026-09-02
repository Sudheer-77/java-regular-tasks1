
package Collections.HashSet;

import java.util.HashSet;
import java.util.Set;

public class TestHashASetDemo1{
public static void main (String args[]) {
	Set<Integer>s= new HashSet<>();
	s.add(16);//0 hear in hashset is working on hash code by dividing the values with 16.
	s.add(32);//0
	s.add(17);//1
	s.add(18);//2
	s.add(19);//3
	s.add(20);//4
	s.add(21);//5
	s.add(22);//6
	s.add(23);//7
	System.out.println(s);
	
	
}
}