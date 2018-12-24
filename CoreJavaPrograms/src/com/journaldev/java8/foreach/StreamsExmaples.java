package com.journaldev.java8.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExmaples {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of(new String[]{"abc","dfg","Kmig"});
		Stream<String> streamAnother = Stream.of("asdasd","dgkdjfgldkjfg","hjKKDlskskdf");
		stream.forEach((s) -> System.out.println(s));
		System.out.println(streamAnother.map(s -> {
			return s.toUpperCase();
		}).collect(Collectors.toList()));
		// upperCase.forEach(s -> System.out.println(s));
		
		List<Integer> numbers = new ArrayList<Integer>(); 
		for(int i=0;i<10;i++) numbers.add(i);
		
		System.out.println(numbers+"\n squres for those numbers"+
				numbers.stream().map(s -> {
					return s*s*s;
				}).collect(Collectors.toList()));
		
		
		System.out.println(
				numbers.stream().filter(n -> n%2 == 0).map(n -> {
					return n*n;
				}).collect(Collectors.toList()));
		
		
		

	}

}
