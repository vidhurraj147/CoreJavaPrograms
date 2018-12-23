package com.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class PersonImplementaion {

	public static void main(String[] args) {
		List<Person> personStream = Arrays.asList(
				new Person("1fName","1lName","Delhi"),
				new Person("2fName","2lName","Goa"),
				new Person("3fName","3lName","Vamoo"),
				new Person("4fName","4lName","Delhi"),
				new Person("5fName","5lName","Delhi"),
				new Person("6fName","6lName","Ulsa"),
				new Person("7fName","7lName","Vamoo"),
				new Person("8fName","8lName","Delhi"),
				new Person("9fName","9lName","Goa"),
				new Person("10fName","10lName","Ulsa"),
				new Person("11fName","11lName","Bisla"),
				new Person("12fName","12lName","Bisla")
				);
//		Map<String, List<Person>> peopleByCity
//        = personStream.collect(Collectors.groupingBy(Person::getCity));
		
		Map<String, List<Person>> sortByCity= personStream.stream().collect(Collectors.groupingBy(Person::getCity));
		System.out.println(sortByCity);

		// personStream.forEach(System.out::println);
		
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		
	}

}
