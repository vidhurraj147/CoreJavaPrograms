package com.tutorialspoint;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8TesterPredicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        System.out.println("PRINT ALL NUMBERS -- PREDICATE IS TRUE");
        eval(list, n -> true);
        System.out.println("PRINT ALL NUMBERS -- PREDICATE IS FALSE");
        eval(list, n -> false);
        System.out.println("PRINT ONLY EVEN NUMBER -- n%2==0");
        eval(list, n -> n % 2 == 0);
        System.out.println("PRINT ONLY ODD NUMBERS -- n->n%2==1");
        eval(list, n -> n % 2 == 1);
        System.out.println("N GREATER THAN 10");
        eval(list, n -> n >= 10);
    }

    private static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer i : list) {
            if (predicate.test(i)) {
                System.out.println("VALUES ARE " + i);
            }

        }
    }
}
