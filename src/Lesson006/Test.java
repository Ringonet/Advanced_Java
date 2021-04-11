package Lesson006;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Один");
        hashMap.put(2, "Два");
        hashMap.put(3, "Три");
        hashMap.put(4, "Четыре");
        hashMap.put(5, "Пять");
        hashMap.put(6, "Шесть");
        hashMap.put(7, "Семь");
        hashMap.put(8, "Восемь");
        hashMap.put(9, "Девять");
        hashMap.put(10, "Десять");

//        System.out.println(map);
//
//        map.put(3, "Третий");
//
//        System.out.println(map);
//
//        System.out.println(map.get(1));
//        System.out.println(map.get(10));

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
