package Lesson016;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Before Java 5
        Iterator<Integer> iterator = list.iterator();

        int idx = 0;
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());

            if (idx == 1)
                iterator.remove();

            System.out.println(iterator.next());

            idx++;

        }

        System.out.println(list);

        // since Java 5
        for(int x : list) {
            list.remove(1);
            System.out.println(x);
        }
    }
}