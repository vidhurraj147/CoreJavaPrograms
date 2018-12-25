package com.stackify;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class EmployeeImpl {

	public static void main(String[] args) {
		// This is for array of emps
		Employee[] arrayOfEmps = {
				new Employee(1, "Jeff Bezos", 1000.0),
				new Employee(2, "Bill Gates", 2000.0),
				new Employee(3, "Mark Zukerberg", 3000.0)
		};
		Stream.of(arrayOfEmps);
		List<Employee> empList = Arrays.asList(arrayOfEmps);
		System.out.println(empList);
		Stream.of(arrayOfEmps[0],arrayOfEmps[1],arrayOfEmps[2]);
		Builder<Employee> streamBuilderEmp = Stream.builder();
		
		streamBuilderEmp.accept(arrayOfEmps[0]);
		streamBuilderEmp.accept(arrayOfEmps[1]);
		streamBuilderEmp.accept(arrayOfEmps[2]);
		
		Stream<Employee> empStream = streamBuilderEmp.build();
		empList.stream().forEach(val -> val.salaryIncrement(200.00));
		
		System.out.println(empList);
		
		Integer[] empIds = {1,2,3};
		
//		List<Employee> employees = Stream.of(empIds)
//									.map(Employee::findById)
//									.collect(Collectors.toList());
		
		List<String> empNames = empList.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(empNames);
									
		
		
		
	}

}
