package Labtaska;
import java.util.*;

public class AnagramGrouping {

    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String word : words) {

            // Convert word into character array
            char[] ch = word.toCharArray();

            // Sort characters
            Arrays.sort(ch);

            // Sorted characters become the key
            String key = new String(ch);

            // If key is not present, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add original word to the corresponding list
            map.get(key).add(word);
        }

        // Print the groups
        System.out.println(map.values());
    }
}