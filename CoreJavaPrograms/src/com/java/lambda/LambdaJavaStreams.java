package com.java.lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LambdaJavaStreams {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList(""," ","Daniel","John","Avaina","Zebra");
		strings.forEach(System.out::print);
		List<String> filteredStrings = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		filteredStrings.forEach(System.out::print);
		
		Random random = new Random();
		random.ints().limit(20).forEach(System.out::println);
		random.ints().limit(20).sorted().forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(4,5,8,44,5,7,8,3,4,6,8,1,2,3);
		numbers.forEach(System.out::print);
		System.out.println();
		List<Integer> squared = numbers.stream().map(i -> i*i).collect(Collectors.toList());
		numbers.stream().map(i -> i*i).collect(Collectors.toList()).forEach(System.out::print);
		
		IntSummaryStatistics stats = numbers.stream().mapToInt(i -> i).summaryStatistics();
		System.out.println(stats.getAverage());
		System.out.println(stats.getCount());
		System.out.println(stats.getSum());
		System.out.println(stats.getMin());
				

	}

}
