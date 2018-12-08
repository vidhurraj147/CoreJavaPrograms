package com.demo.regex;

import java.util.ArrayList;
import java.util.List;

public class LookaheadDemo {

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("password");
        input.add("p4ssword");
        input.add("p4ssw0rd");
        input.add("p45sword");

        for (String pswd : input) {
            if (pswd.matches("^(?=.*[0-9].*[0-9])[a-zA-Z0-9]{8,12}$")) {
                System.out.println("MATCHED " + pswd);
            }
            else {
                System.out.println("NOT MATCHED" + pswd);
            }

        }
    }

}
