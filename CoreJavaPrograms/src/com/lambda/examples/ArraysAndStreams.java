package com.lambda.examples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams {

    public static void main(String[] args) {
        Integer values[] = { 0, 4, 5, 9, 8, 1, 2, 3, 7, 6 };

        // Displayed all array values
        System.out.printf("Original values %s %n", Arrays.asList(values));

        // Sort values in ASC order with stream
        System.out.printf("Sorted values are : %s%n", Arrays.stream(values).sorted().collect(Collectors.toList()));

    }

}
