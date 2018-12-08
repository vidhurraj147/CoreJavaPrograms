package com.tutorialspoint.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EvalFunction {

    public static void main(String[] args) {
        List allNumbers = getRandomList();
        allNumbers.forEach(System.out::println);
        eval(allNumbers, s -> true);
        System.out.println("ONLY EVEN NUMBERS ");
        eval(allNumbers, s -> s % 2 == 0);
        System.out.println("DEVISIBLE BY 3 ");
        eval(allNumbers, s -> s % 3 == 0 && s != 0);
    }

    private static void eval(List<Integer> allNumbers, Predicate<Integer> predicate) {
        for (int i : allNumbers) {
            if (predicate.test(i)) {
                System.out.println("THE VALUES ARE " + i);
            }

        }
    }

    private static List getRandomList() {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            al.add((int) (Math.random() * 100));
        }

        return al;
    }

}
