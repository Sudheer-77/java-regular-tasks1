package Collections;

import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("KIRAN");
        names.add("ARUN");

        // Add at beginning
        names.addFirst("RAJU");

        // Add at end
        names.addLast("SURESH");

        System.out.println(names);
    }
}