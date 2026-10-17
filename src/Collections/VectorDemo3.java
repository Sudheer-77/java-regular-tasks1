package Collections;

import java.util.Vector;

public class VectorDemo3 {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");

        System.out.println(names.get(0));
        System.out.println(names.get(2));
    }
}