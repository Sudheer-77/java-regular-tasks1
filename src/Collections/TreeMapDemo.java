package Collections;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<Integer, String> players = new TreeMap<>();

        // 1. Add players
        players.put(18, "Virat Kohli");
        players.put(45, "Rohit Sharma");
        players.put(7, "MS Dhoni");
        players.put(93, "Jasprit Bumrah");
        players.put(8, "Ravindra Jadeja");

        // Keys are automatically sorted
        System.out.println("Players: " + players);

        // 2. Get value using key
        System.out.println("Jersey 18: " + players.get(18));

        // 3. Update value
        players.put(18, "Virat Kohli - King");

        System.out.println("After update: " + players);

        // 4. Search key
        System.out.println("Is jersey 45 present? "
                + players.containsKey(45));

        // 5. Search value
        System.out.println("Is MS Dhoni present? "
                + players.containsValue("MS Dhoni"));

        // 6. Remove
        players.remove(93);

        System.out.println("After removing Bumrah: " + players);

        // 7. First key
        System.out.println("First key: " + players.firstKey());

        // 8. Last key
        System.out.println("Last key: " + players.lastKey());

        // 9. Get first entry
        System.out.println("First player: "
                + players.firstEntry());

        // 10. Get last entry
        System.out.println("Last player: "
                + players.lastEntry());

        // 11. Size
        System.out.println("Size: " + players.size());

        // 12. Iterate
        System.out.println("\nPlayers:");

        for (var entry : players.entrySet()) {

            System.out.println(
                entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}