package Collections;

import java.util.Vector;

public class VectorDemo6 {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");

        if (names.contains("ARUN")) {
            System.out.println("ARUN is present");
        } else {
            System.out.println("ARUN is not present");
        }
    }
}