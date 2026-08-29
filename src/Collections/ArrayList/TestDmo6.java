package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestDmo6 {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Sudheer");
        students.add("Rahul");
        students.add("Ravi");
        students.add("Anil");
 
        // 1. Normal for loop
        System.out.println("Using for loop:");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        	//System.out.println(students);  this will give thw complete collection so we should use the previous "students.get(i)"
        }


        // 2. For-each loop
        System.out.println("\nUsing for-each loop:");

        for (String student : students) {
            System.out.println(student);
        }


        // 3. Iterator


        
        
        System.out.println("\nUsing Iterator:");
        Iterator<String>its =students.iterator();
        while(its.hasNext()) {
        	System.out.println(its.next());
        }
    }
}