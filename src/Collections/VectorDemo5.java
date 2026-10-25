package Collections;

import java.util.Vector;

public class VectorDemo5 {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");
        names.add("SURESH");

        // Remove KIRAN
        names.remove("KIRAN");

        System.out.println(names);
    }
}