package Lesson004;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        // [1][2][3][4][5] + [6]  Elements are placed at the beginning of the list

        // [7][6][5][4][3][2][1]  Each element is moved to the right by one unit

        measureTime(linkedList);
        measureTime(arrayList);

//        linkedList.add(1);
//        linkedList.get(0);
//        linkedList.size();
//        linkedList.remove(0);

    }

    private static void measureTime(List<Integer> list) {


        long start = System.currentTimeMillis();

//      for(int i = 0; i < 100000; i++) {
//            list.add(i);
//      }

//        for(int i = 0; i <100000; i++) {
//            list.get(i);
//        }

//        for(int i = 0; i < 100000; i++) {
//            list.add(i);
//        }

        // [] - > [0] -> [0][1] -> [0][1][2]...

        for(int i = 0; i < 100000; i++) {
            list.add(0, i);
        }

        // [] - > [0] -> [1][0] -> [2][1][0]...

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
