package Collections;

import java.util.LinkedList;

public class LinkedListDemo7 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");
        names.add("SURESH");

        for (String name : names) {
            System.out.println(name);
        }
    }
}