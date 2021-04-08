package Lesson002;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        int[] x = new int[3];
//
//        for(int i = 0; i <4; i++) {
//            x[i] = 1;
//        }

//        ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i < 6; i++) {
            list.add(i);
        }

//        System.out.println(arrayList);
//
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(999));
//
//        System.out.println(arrayList.size());

//        for (int i =0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//
//        for (Integer x : arrayList) {
//            System.out.println(x);
//        }

        list.remove(2); // [1,2,3,4,5] -> [1,2,4,5]
        System.out.println(list);

        //We remove a lot of elements here
        list = new LinkedList<Integer>();
    }
}
