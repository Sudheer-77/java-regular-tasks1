package Labtaska;
import java.util.ArrayList;

public class ArrayInsertElement {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("JavaScript");
        list.add("Python");
        list.add("SQL");
        list.add("HTML");

        int index = list.indexOf("Python");

        list.add(index + 1, "Java");

        System.out.println(list);
    }
}