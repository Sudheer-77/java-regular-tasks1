package Collections;

import java.util.LinkedList;

public class LinkedListDemo5 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");
        names.add("SURESH");

        // Remove first element
        names.removeFirst();

        // Remove last element
        names.removeLast();

        System.out.println(names);
    }
}