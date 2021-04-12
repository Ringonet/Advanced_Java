package Lesson008;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // union - объединение множеств
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(union);

        // intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println(intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println(difference);

        Set<Integer> difference1 = new HashSet<>(set2);
        difference1.removeAll(set1);

        System.out.println(difference1);

//        Set<String> hashSet = new HashSet<>();
//        Set<String> linkedHashSet = new LinkedHashSet<>();
//        Set<String> treeSet = new TreeSet<>();

//        hashSet.add("Artem");
//        hashSet.add("Vladimir");
//        hashSet.add("Alla");
//        hashSet.add("Grigoriy");
//        hashSet.add("Eduard");
//        hashSet.add("Alla");
//        hashSet.add("Alla");

        // union - объединение множеств

//        for(String name : hashSet) {
//            System.out.println(name);
//        }
//
//        System.out.println(hashSet);

//        linkedHashSet.add("Artem");
//        linkedHashSet.add("Vladimir");
//        linkedHashSet.add("Alla");
//        linkedHashSet.add("Grigoriy");
//        linkedHashSet.add("Eduard");
//
//        for(String name : linkedHashSet) {
//            System.out.println(name);
//        }

//        treeSet.add("Artem");
//        treeSet.add("Vladimir");
//        treeSet.add("Alla");
//        treeSet.add("Grigory");
//        treeSet.add("Eduard");

//        for(String name : treeSet) {
//            System.out.println(name);
//        }

//        System.out.println(hashSet.contains("Artem"));
//        System.out.println(hashSet.contains("Vova"));
//
//        System.out.println(hashSet.isEmpty());
    }
}
