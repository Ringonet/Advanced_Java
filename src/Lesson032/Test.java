package Lesson032;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String text = "Hello, guys! I sent you my email joe@gmail.com so we can\n" +
                "keep in touch. Thanks, Joe! That's cool. I am sending you\n" +
                "my address: tim@yandex.ru. Lets stay in touch..." +
                "My ne email goodwin@mail.ru";

        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex|mail)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        int count = 0;
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            count++;
        }
        System.out.println("Total number of email is " + count);
    }
}
