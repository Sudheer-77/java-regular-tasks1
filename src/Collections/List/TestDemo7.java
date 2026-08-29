package Collections.List;

import java.util.List;
import java.util.ArrayList;

public class TestDemo7 {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Sudheer");
        students.add("Rahul");
        students.add("Ravi");
        students.add("Anil");
        students.add(1,"king");

        System.out.println(students);
    }
}