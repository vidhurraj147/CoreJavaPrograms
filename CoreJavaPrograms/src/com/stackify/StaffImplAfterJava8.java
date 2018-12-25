package com.stackify;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StaffImplAfterJava8 {
	public static void main(String[] args){
		List<Staff> staffList = Arrays.asList(
				new Staff("Rahul", 30, new BigDecimal(1000)),
				new Staff("Podisha", 27, new BigDecimal(2000)),
				new Staff("Avaina", 33, new BigDecimal(3000)),
				new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
				);
		
		List<StaffPublic> staffPublicConverted = staffList.stream()
										.map(x -> {
												StaffPublic staffPublicInternal = new StaffPublic();
												staffPublicInternal.setName(x.getName());
												staffPublicInternal.setAge(x.getAge());
												staffPublicInternal.setExtra("ALWAYS_EXTRA");
												return staffPublicInternal;
										}).collect(Collectors.toList());
		System.out.println(staffPublicConverted);
										
										
		
	}
}
