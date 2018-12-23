package com.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		List numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,25,3,6,8);
		// numbers.forEach(System.out::println);
		
		eval(numbers,n->true);
		eval(numbers,n-> n%3 == 0);
		eval(numbers,n-> n>5);
		
		Predicate<Integer> predicate2 = n -> true;
		numbers.forEach(n-> predicate2.test((Integer) n));
	
	}

	public static void eval(List<Integer> numbers, Predicate<Integer> predicate){
		for(int num : numbers){
			if(predicate.test(num)){
				// System.out.println("number is "+num);
			}
		}
		
	}
}
