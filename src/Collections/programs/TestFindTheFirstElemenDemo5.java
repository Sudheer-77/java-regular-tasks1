
package Collections.programs;

import java.util.ArrayList;
import java.util.List;

public class TestFindTheFirstElemenDemo5 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(14);
        l.add(14);
        l.add(7);
        l.add(1);
        l.add(2);
        l.add(3);

        for (int i = 0; i < l.size(); i++) {

            int count = 1;

            for (int j = 0; j < l.size(); j++) {

                if (i != j && l.get(i).equals(l.get(j))) {
                    count++;
                }
            }

            if (count == 1) {

                System.out.println("First unique element: " + l.get(i));

                break;
            }
        }
    }
}
