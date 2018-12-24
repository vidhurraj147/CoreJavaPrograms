package com.journaldev.java8.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class HashMapExs {

	public static void main(String[] args) {
		Map<Integer, String> mapNumbers = new HashMap<>();
		Random random = new Random();
		for(int i=0;i<20;i++){
			mapNumbers.put(i, ""+random.nextInt(15));
		}
		System.out.println(mapNumbers);
		
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "linode.com");
	    map.put(2, "heroku.com");
	    map.put(3, "something");
	    map.put(4, "something asd");
	    map.put(5, "something");
		
		//Map -> Stream -> Filter -> String
		String result = map.entrySet().stream()
			.filter(x -> "something".equals(x.getValue()))
			.map(x->x.getValue())
			.collect(Collectors.joining());
		System.out.println(result);
		
		// System.out.println(mapNumbers.entrySet().stream().filter((i) -> "10".equals(i.getValue())).map(i -> i.getValue()).collect(Collectors.joining()));
	}

}
