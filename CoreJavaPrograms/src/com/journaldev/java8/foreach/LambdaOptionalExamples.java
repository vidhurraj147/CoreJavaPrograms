package com.journaldev.java8.foreach;

import java.util.Optional;
import java.util.stream.Stream;

public class LambdaOptionalExamples {

	public static void main(String[] args) {
		Stream<Integer> intStream = Stream.of(1,2,3,4,5);
		Optional<Integer> optionalStream = intStream.reduce((i,j) -> {
			return i*j;
		});
		if(optionalStream.isPresent()){
			System.out.println(optionalStream.get());
		}
		Stream<Integer> intStream2 = Stream.of(1,2,3,4,5);
//		System.out.println(intStream2.reduce((i,j) -> { 
//			return i*j;
//			}));
		// System.out.println(intStream2.count());
		// System.out.println(intStream2.anyMatch(i -> i == 4));
		// System.out.println(intStream2.anyMatch(i -> i > 6));
		System.out.println(intStream2.noneMatch(i -> i > 6));
		
		Stream<String> names = Stream.of("Jack","John","David","Avaina", "Rahul","Podisha","Prem","Avunu");
		System.out.println(names.filter(n -> n.startsWith("A")).findFirst().get());
		
	}

}
