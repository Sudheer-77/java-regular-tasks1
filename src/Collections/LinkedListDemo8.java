package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo8 {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.offer("RAJU");
        queue.offer("KIRAN");
        queue.offer("ARUN");

        System.out.println(queue);

        // Remove first element
        System.out.println("Removed: " + queue.poll());

        // See first element
        System.out.println("First: " + queue.peek());

        System.out.println(queue);
    }
}