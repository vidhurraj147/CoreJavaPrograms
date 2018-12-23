package com.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class Tester2 {

	public static void main(String[] args) {
		Tester2 t2 = new Tester2();
		TesterMathInterface addition;
		TesterMathInterface substraction;
		TesterMathInterface division;
		
		addition = (int a, int b) -> a+b;
		substraction = (int a, int b) -> a-b;
		division = (int a, int b) -> a/b;
		
		System.out.println("addition " + addition.operations(100, 200));
		System.out.println("substraction "+substraction.operations(100, 50));
		System.out.println("division "+division.operations(100, 10));
		
		Test2FullNameInterface fullName = (String fName, String lName) -> "Added via on the go"+fName+":::"+lName;
		System.out.println(fullName.getFullName("Rahul", "kadgekar"));
		
		Greet greet;
		greet = (message) -> "Hello !!! "+message;
		System.out.println(greet.lemmeGreet("Rahul Kadgekar"));
		greet = message -> "Hello again "+message;
		greet = message -> "Hello again BUT WHERE IS AVAINA "+message;
		System.out.println(greet.lemmeGreet("Podisha Dandavati Raghunath"));
		
		List names = new ArrayList<String>();
		names.add("asdads");
		names.add("1asdads");
		names.add("2asdads");
		names.add("3asdads");
		names.add("4asdads");
		
		names.forEach(System.out::println);
	}

}
