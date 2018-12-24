package com.journaldev.java8.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSortedandReverseSorted {
	public static void main(String[] args){
		Stream<String> stream = Stream.of("asda","fgdfg","sdfsdf","123","10");
		Stream<String> stream2 = Stream.of("asda","fgdfg","sdfsdf","123","10");
		System.out.println(
				stream.sorted().collect(Collectors.toList())
				);
		System.out.println(
				stream2.sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				);
		
		// ------------Stream of List
		Stream<List<String>> streamOfList = Stream.of(
					Arrays.asList("david"),
					Arrays.asList("becon"),
					Arrays.asList("Amit")
					,Arrays.asList("dawn","assds","yosuf")
				);
		Stream listToString = streamOfList.flatMap(s -> s.stream());
		listToString.forEach(System.out::println);
		// streamOfList.forEach(System.out::print);
		
	}

}
