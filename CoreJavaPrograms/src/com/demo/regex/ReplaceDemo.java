package com.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDemo {
    public static void main(String[] args) {
        String input = "User clientId=23421. Some more text clientId=33432. This clientNum=100";

        Pattern p = Pattern.compile("(clientId=)(\\d+)");
        Matcher m = p.matcher(input);

        StringBuffer result = new StringBuffer();
        while (m.find()) {
            System.out.println("Masking: " + m.group(2));
            m.appendReplacement(result, m.group(1) + "***masked***");
            System.out.println("Start index " + m.start());
            System.out.println("End index " + m.end());
        }
        m.appendTail(result);
        System.out.println(result);
    }
}