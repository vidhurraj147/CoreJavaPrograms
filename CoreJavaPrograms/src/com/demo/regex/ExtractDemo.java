package com.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDemo {

    public static void main(String[] args) {
        String input = "I have a cat, but I like my dog better.";
        Pattern p = Pattern.compile("(mouse|cat|lion|dog|car)");
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println("FOUND ANIMAL " + m.group());
        }
    }

}
