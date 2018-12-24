package com.journaldev.java8.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelSequentialStreams {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=80;i<101;i++)
		list.add(i);
		
		Stream<Integer> seqStreamAllinOne = list.stream().filter(p -> p > 90);
		List<Integer> above90List = list.stream().filter(p -> p >90).collect(Collectors.toList());
		
		Stream<Integer> seqStream = list.stream();
		Stream<Integer> parallelStream = list.parallelStream();
		
		Stream<Integer> justSeqStream = seqStream.filter(p -> p > 90);
		Stream<Integer> justParallelStream = parallelStream.filter(p -> p > 90);
		
		justParallelStream.forEach(p -> System.out.println("The value from ParalledStream "+p));
		justSeqStream.forEach(p -> System.out.println("The value from SequentialStrem"+p));
		seqStreamAllinOne.forEach(p -> System.out.println("p val "+p));
		
		System.out.println(list.stream().filter(p -> p > 90).mapToInt(p -> p).sum());;
		int totalVal = list.stream().mapToInt(p -> p).sum();
		System.out.println(totalVal);
		
		LongStream ls = Arrays.stream(new long[]{1,2,3,4,5,6});
		IntStream in = "abc".chars();
		in.forEach(s -> System.out.println(s));
		
//		Stream<String> stream1 = Stream.generate(() -> {return "abcd";});
//		Stream<String> stream2 = Stream.iterate("asdfsdfbcd", (s) -> s);
//		stream2.forEach(s -> System.out.println(s));
		
	}

}
