package Collections;

import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");
        names.add("SURESH");

        // Check whether ARUN exists
        if (names.contains("ARUN")) {
            System.out.println("ARUN is present");
        } else {
            System.out.println("ARUN is not present");
        }
    }
}