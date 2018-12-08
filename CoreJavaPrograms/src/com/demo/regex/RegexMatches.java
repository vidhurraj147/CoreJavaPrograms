package com.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//the example that counts the number of times the word "cat" appears in the input string
public class RegexMatches {
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattle cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT); // get a matcher obj
        int count = 0;

        while (m.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("Start " + m.start());
            System.out.println("End " + m.end());
        }

    }

}
