package com.demo.regex;

import java.util.ArrayList;
import java.util.List;

public class SSNValidateDemo {

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("326-11-4792");
        input.add("2326-11-4792");
        input.add("3326-11-4792");
        input.add("326-141-4792");
        input.add("326-11-4792");
        input.add("326-11-4792");
        input.add("323-11-4792");
        input.add("226-11-4792");
        input.add("726-11-4792HELOO");
        input.add("726-11-4792DEMO");
        input.add("626-11-4792");
        input.add("926-11-4792");
        input.add("999999999");

        for (String value : input) {
            // System.out.println("SSN VALUE IS" + value);
            if (value.matches("^(\\d{3}-?\\d{2}-?\\d{4})$")) {
                System.out.println("VALID SSN # " + value);
            }
            else {
                System.out.println("INVALID SSN # " + value);
            }
        }

    }

}
