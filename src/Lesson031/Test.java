package Lesson031;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String a = "Hello there hey";
        String[] words =  a.split(" ");
        System.out.println(Arrays.toString(words));

        String b = "Hello78189there485189hey";
        String[] words2 =  b.split("\\d+");
        System.out.println(Arrays.toString(words2));

        String c = "Hello there hey";
        String modifiedString = c.replace(" ", ".");
        System.out.println(modifiedString);

        String d = "Hello489178941there2525hey";
        String modifiedString2 = d.replaceAll("\\d+", ".");
        System.out.println(modifiedString2);

        String modifiedString3  = b.replaceFirst("\\d+", "_");
        System.out.println(modifiedString3);
    }
}
