
package Collections.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCommonElementInTheListDemo7 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();

        list2.add(2);
        list2.add(2);
        list2.add(4);
        list2.add(4);
        list2.add(6);

        Set<Integer> commonElements = new HashSet<>();

        for (Integer num : list1) {

            if (list2.contains(num)) {
                commonElements.add(num);
            }
        }

        System.out.println("Common elements: " + commonElements);
    }
}

