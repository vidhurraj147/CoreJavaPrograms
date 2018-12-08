package com.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatchesT {
    private static final String REGEX = "foo";
    private static final String INPUT = "fooooooooooooooooooo";
    private static final String INPUT1 = "foo";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("CURRENT REGEX " + REGEX);
        System.out.println("CURRENT INPUT " + INPUT);

        System.out.println("lookingAt() " + matcher.lookingAt());
        System.out.println("matches() " + matcher.matches());

        matcher = pattern.matcher(INPUT1);

        System.out.println("INPUT1 " + INPUT1);
        System.out.println("lookingAt() " + matcher.lookingAt());
        System.out.println("matcher() " + matcher.matches());

    }

}
