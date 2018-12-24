package com.winterbe;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Create arraylist filter with C uppsercase sort print
		List<String> list = Arrays.asList("a1","b1","c2","c5","c1","c4","d1","f1","c3");
		
		list
			.stream()
			.filter(val -> val.startsWith("c"))
			// .map(val -> val.toUpperCase())
			.map(String::toUpperCase)
			.map(val -> val+" Added extra")
			.sorted()
			.forEach(Streams::someRandom);                              //System.out::println);
		
		List<String> list2 = Arrays.asList("a1","b1","c2","c5","c1","c4","d1","f1","c3");
		list2
			.stream()
			.findFirst()
			.ifPresent(Streams::someRandom);
		
		IntStream.of(2,5,4,8,6,9,3,2,1,5,10);
		IntStream.range(0, 20).forEach(System.out::println);
		
		Arrays.stream(new int[]{1,5,9,6,7,6}).forEach(System.out::println);
		Arrays.stream(new int[]{1,5,9,6,7,6})
		.map(val -> val*val)
		.forEach(System.out::println);
		
		Arrays.stream(new int[]{1,5,9,6,7,6})
		.average()
		.ifPresent(System.out::println);
		
		Arrays.stream(new int[]{1,4,5,6,7,4,2,3,6,7})
		.map(val->val*val)
		.average()
		.ifPresent(System.out::println);
		
		Stream.of("a1","a2","a3","a4","a5","a90")
		//.filter(val -> val.substring(1))
		.map(val ->val.substring(1))
		.mapToInt(Integer::parseInt)
		.max()
		.ifPresent(System.out::println);
		//.forEach(System.out::println);'
		
		// Primitive to Object
		Arrays.stream(new int[]{1,2,3,4,5,6})
			.mapToObj(val -> "a"+val+"")
			.forEach(System.out::println);
		
		Stream.of("a1","b1","c1","d1","e1","f1","g1","d1")
		.filter(s -> {
			System.out.println("Values in FILTER are : "+s);
			return true;
		});
		
		Stream.of("a1","b1","c1","d1","e1","f1","g1","d1")
		.filter(s -> {
			System.out.println("Values in FILTER are : "+s);
			return true;
		}).forEach(s -> {
			System.out.println("Values in FOREACH are : "+s);
		});
		
		Stream.of("a1","b1","c1","d1","e1","f1","g1","d1")
			.map(val -> {
				System.out.println("MAP values are "+val);
				return val.toUpperCase();
			})
			.anyMatch(val -> {
				System.out.println("ANYMATCH values are "+val);
				return val.equals("C1");
			});
		
		Stream<String> stringValues = Stream.of("a1","b1","c1","d1","e1","f1","g1","d1") //thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
			.filter(val ->val.startsWith("c1"));
		stringValues.anyMatch(s->true);
		// stringValues.noneMatch(s-> false); 
		
		Supplier<Stream<String>> supplierStream = () -> Stream.of("a1","b1","c1","d1","e1","f1","g1","d1").filter(val -> val.startsWith("c"));
		supplierStream.get().anyMatch(s -> true);
		supplierStream.get().noneMatch(s -> true);
		
	}
	public static void someRandom(String s){
		System.out.println("This is someRandom method()"+s);
	}

}
