package com.tutorialspoint.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {

    public static void main(String[] args) {
        System.out.println("Using Java 8");
        List<String> strings = Arrays.asList("Demo", "Remo", "Danial", "abc", "", "bc", "efg", "abcd", "", "jkl");
        long count = strings.stream().count();
        System.out.println("total count is " + count);
        count = strings.stream().filter(s -> !s.isEmpty()).count();
        System.out.println("total count WHICH ARE NOT EMPTY " + count);
        count = strings.stream().filter(s -> s.isEmpty()).count();
        System.out.println("total count OF EMPTY strings " + count);
        count = strings.stream().filter(s -> s.length() == 3).count();
        System.out.println("total count OF 3 length strings " + count);
        System.out.println("Actual list " + strings + " size is" + strings.size());
        // Eliminate empty string
        List<String> filtered = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered list " + filtered + " size is " + filtered.size());
        String mergedString = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(":::"));
        System.out.println("Merged String " + mergedString);

        // List of 20 random numbers
        List<Integer> numbers = getRandomNumbers();
        System.out.println(numbers);
        System.out.println("Squares of numbers ");
        numbers.stream().map(i -> i * i).forEach(System.out::println);
        numbers.stream().map(i -> i * i).forEach(i -> System.out.print(i + ","));
        System.out.println(numbers.stream().map(i -> i * i).collect(Collectors.toList()));
        System.out.println(numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList()));
        System.out.println("IntSummaryStatistics ");
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        // System.out.println(numbers.stream().mapToDouble((x) -> x).average());
        System.out.println(stats.getSum());
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
        System.out.println(stats.getMin());
        System.out.println(stats.getMax());
    }

    private static List<Integer> getRandomNumbers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            list.add((int) Math.floor(Math.random() * 10));
        }

        return list;
    }

}
