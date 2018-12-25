package org.geeksforgeeks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberTimes3 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> numbersTimes3 = numbers
										.stream()
										.map(x -> x * 3)
										.collect(Collectors.toList());
		System.out.println("numbers"+numbers);
		System.out.println("numbersTimes3"+numbersTimes3);
		
	}	

}
