package com.java.lambda;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		Integer a = null;
		Integer b = 20; 
		System.out.println("Values are -- a "+a+", b"+b );
		Optional<Integer> a1 = Optional.ofNullable(a);
		Optional<Integer> b1 = Optional.of(b);
		System.out.println(sum(a1,b1));
	}

	private static int sum(Optional<Integer> a, Optional<Integer> b) {
		// Integer is present
		System.out.println("A value present "+a.isPresent());
		System.out.println("B value is present "+b.isPresent());
		
		Integer a1 = a.orElse(0);
		Integer b1 = b.get();
		return a1+b1;
		
		
	}

}
