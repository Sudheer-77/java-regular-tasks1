package Collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        // Create ArrayDeque
        ArrayDeque<String> players = new ArrayDeque<>();

        // 1. Add elements at the end
        players.addLast("Virat Kohli");
        players.addLast("Rohit Sharma");
        players.addLast("MS Dhoni");

        System.out.println("Deque: " + players);

        // 2. Add element at the beginning
        players.addFirst("Jasprit Bumrah");

        System.out.println("After addFirst: " + players);

        // 3. Add element at the end
        players.addLast("Ravindra Jadeja");

        System.out.println("After addLast: " + players);

        // 4. View first element
        System.out.println("First player: " + players.peekFirst());

        // 5. View last element
        System.out.println("Last player: " + players.peekLast());

        // 6. Remove first element
        System.out.println("Removed first: " + players.removeFirst());

        System.out.println("After removeFirst: " + players);

        // 7. Remove last element
        System.out.println("Removed last: " + players.removeLast());

        System.out.println("After removeLast: " + players);

        // 8. Search
        System.out.println(
            "Is MS Dhoni present? " + players.contains("MS Dhoni")
        );

        // 9. Size
        System.out.println("Size: " + players.size());

        // 10. Iterate
        System.out.println("Players:");

        for (String player : players) {
            System.out.println(player);
        }
    }
}