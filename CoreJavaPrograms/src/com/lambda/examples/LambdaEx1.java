package com.lambda.examples;

import java.util.stream.IntStream;

public class LambdaEx1 {

    public static void main(String[] args) {
        int[] values = { 3, 7, 5, 4, 2, 1, 8, 9, 6, 10 };

        // Displaying original values
        System.out.println("Original values");

        IntStream.of(values).forEach((int value) -> System.out.printf("%d,", value));
        {
            // new IntConsumer(){
            // public void accept(int value){
            // System.out.printf("%d", value);
            // }
            // }
        }
        // IntStream existing Count, Min, Mac, Avg
        System.out.println();
        System.out.printf("%n Count: %d%n", IntStream.of(values).count());
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("MAX:%d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("SUM:%d%n", IntStream.of(values).sum());
        System.out.printf("Avg: %.2f%n", IntStream.of(values).average().getAsDouble());

        // IntStream REDUCE METHOD
        System.out.printf("%n Sum Via REDUCE METHOD: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y));

        // Sum of SQUARES of values with REDUCE MENTHOD IntStream
        System.out.printf("Sum of Squares via reduce method : %d%n",
                IntStream.of(values).reduce(0, (x, y) -> x + y * y));

        // Product of all numbers with REDUCE METHOD
        System.out.printf("Product of all numbers : %d,%n", IntStream.of(values).reduce(1, (x, y) -> x * y));

        // EVEN values displayed in Sorted Order
        System.out.printf("Even values displayed in Sorted Order: ");
        IntStream.of(values)
                .filter(value -> value % 2 == 0)
                .sorted()
                .forEach(value -> System.out.printf("%d,", value));

        // ODD values displayed in Sorted ORDER
        System.out.printf("%n ODD VALUES SORTED ORDER : ");
        IntStream.of(values)
                .filter(valueOdd -> valueOdd % 2 != 0)
                .sorted()
                .forEach(valueOdd -> System.out.printf("%d,", valueOdd));

        // Odd values displayed and Multipled by 10
        System.out.printf("%n ODD values Sorted displayed by 10 multipled ");
        IntStream.of(values)
                .filter(value -> value % 2 != 0)
                .map(value -> value * 10)
                // .map(value -> value * 10)
                .sorted()
                .forEach(value -> System.out.printf("%d,", value * 10));

        IntStream.of(values);
        // SUM range of integers from 1 - 10 EXCLUSIVE
        System.out.printf("%n Sum of integers from 1-9: %d%n", IntStream.range(1, 10).sum());

        // Sum range of integers 1-10 inclusive
        System.out.printf("Sum of integers from 1-10: %d%n", IntStream.rangeClosed(1, 10).sum());

    }

}
