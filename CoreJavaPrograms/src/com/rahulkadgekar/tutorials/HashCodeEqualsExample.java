package com.rahulkadgekar.tutorials;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEqualsExample {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		Map<Employee, String> mapEmp = new HashMap<Employee, String>();
		mapEmp.put(emp1, "JACK");
		mapEmp.put(emp2, "JACK");
		System.out.println("mapEmp size is "+mapEmp.size());
		
		Integer I1 = new Integer(1);
		Integer I2 = new Integer(1);
		Map<Integer, String> mapInt = new HashMap<Integer, String>();
		mapInt.put(I1,"ONE");
		mapInt.put(I2,"ONE");
		System.out.println("mapInt size is "+mapInt.size());
	}
	
}

class Employee{
	private int id;
	public Employee(int id) {
		super();
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
