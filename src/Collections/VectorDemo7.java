package Collections;

import java.util.Vector;

public class VectorDemo7 {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");

        for (String name : names) {
            System.out.println(name);
        }
    }
}