package com.io.javabrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionHanldingExample {
    public static void main(String[] args) {
        int[] someNumbers = { 1, 2, 3, 4, 5, 6 };
        int key = 2;

        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));

        // process(someNumbers, key, (v, k) -> {
        // try {
        // System.out.println(v / k);
        // } catch (ArithmeticException e) {
        // System.out.println("THIS IS ERROR FIX '0' ArithmeticException: " + e);
        // }
        // });

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : someNumbers) {
            biConsumer.accept(i, key);
            // try {
            // biConsumer.accept(i, key);
            //
            // } catch (ArithmeticException e) {
            // System.out.println("THIS IS ERROR FIX 0 " + e);
            // }
            // System.out.println(i + key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        // return consumer;
        return (v, k) -> System.out.println(v + k);
    }

}
