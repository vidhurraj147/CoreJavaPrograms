package com.winterbe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PersonAdvanceImpl {
	public static void main(String[] args){
		List<PersonAdvance> pa = Arrays.asList(
				new PersonAdvance("Max", 18),
		        new PersonAdvance("Peter", 23),
		        new PersonAdvance("Pamela", 23),
		        new PersonAdvance("David", 12)
				);
			pa
			.stream()
			.filter(val -> val.getName().startsWith("P"))
			.collect(Collectors.toList())
			.forEach(System.out::println);
			
			Map<Integer, List<PersonAdvance>> groupByAge = pa.stream().collect(Collectors.groupingBy(val -> (Integer) val.getAge()));
			groupByAge.forEach(
					(val1,val2) -> System.out.format("age %s: %s \n", val1,val2)
					);
			
			Double avgAge = pa.stream().collect(Collectors.averagingDouble(val -> val.getAge()));
			System.out.println(avgAge);
			
			IntSummaryStatistics iss = pa.stream().collect(Collectors.summarizingInt(val -> val.getAge()));
			System.out.println("iss "+iss);
			
			System.out.println(pa.stream().map(val -> val.getName()).collect(Collectors.joining("||")));
			String value = pa.stream()
				.filter(val -> val.getAge() > 17)
				.map(val -> val.getName())
				.collect(Collectors.joining(" and ", "In India ", " are in legal age!!!"));
			System.out.println(value);
			
//			Map<Integer,String> mapAgeToNames = pa
//												  .stream()
//												  .collect(Collectors.toMap)
//												  
			Map<Integer, String> map = pa
				    .stream()
				    .collect(Collectors.toMap(
				    		p->p.getAge(),
				    		p->p.getName(),
				    		(name1,name2) -> name1 +":::"+name2));		
			System.out.println(map);
			
//			Collector<PersonAdvance, StringJoiner, String> personNameCollector = Collector.of(
//					() -> new StringJoiner("||"),
//					(j,p) -> j.add(p -> p.get)
//					);
	}
}
