package com.tutorialspoint;

import java.util.Optional;

public class Java8TesterOptional {

    public static void main(String[] args) {
        Java8TesterOptional java8Tester = new Java8TesterOptional();
        Integer value1 = null;
        Integer value2 = new Integer(10);
        Integer val3 = null;

        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);
        // Optional<Integer> c = Optional.of(val3);

        System.out.println(java8Tester.sum(a, b));

    }

    private Integer sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("First PARAMETER A is present a.isPresent() " + a.isPresent());
        System.out.println("First parameter A " + a.orElse(null));
        System.out.println("Second paramter B is present " + b.isPresent());
        System.out.println("First parameter B " + b.orElse(null));

        Integer value1 = a.orElse(new Integer(0));
        Integer value2 = b.get();

        return value1 + value2;
    }

}
