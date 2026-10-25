package Collections;

import java.util.Vector;

public class VectorDemo8 {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");

        System.out.println("Size = " + names.size());
        System.out.println("Capacity = " + names.capacity());
    }
}