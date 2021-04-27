package Lesson030_2;

public class Test {
    public static void main(String[] args) {
        String a = "1784d";
        String b = "";
        String c = "1784";
        String d = "-1784";
        String e = "+1784";

        System.out.println(a.matches("\\d+"));
        System.out.println(b.matches("\\d*"));
        System.out.println(c.matches("\\d*"));
        System.out.println(d.matches("-\\d*"));
        System.out.println(c.matches("-?\\d*"));
        System.out.println(d.matches("-?\\d*"));
        System.out.println(c.matches("([-+])?\\d+"));
        System.out.println(d.matches("([-+])?\\d+"));
        System.out.println(e.matches("([-+])]?\\d+"));

        String f = "Asea4123456";

        System.out.println(f.matches("[a-zA-z]+\\d+"));

        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        String url3 = "http://ya.ru";

        System.out.println("Web address is " + url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println("Web address is " + url2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println("Web address is " + url3.matches("http://www\\..+\\.(com|ru)"));

        String g = "1";

        System.out.println(g.matches("\\d{2,}"));
    }
}
