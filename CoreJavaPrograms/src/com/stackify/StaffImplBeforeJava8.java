package com.stackify;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaffImplBeforeJava8 {

	public static void main(String[] args) {
		List<Staff> staffList = Arrays.asList(
				new Staff("Rahul", 30, new BigDecimal(1000)),
				new Staff("Podisha", 27, new BigDecimal(2000)),
				new Staff("Avaina", 33, new BigDecimal(3000)),
				new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
				);

		List<StaffPublic> convertStaffToStaffPublic = convertToStaffPublic(staffList);
		System.out.println("convertStaffToStaffPublic- "+convertStaffToStaffPublic);
	}

	private static List<StaffPublic> convertToStaffPublic(List<Staff> staffList) {
		List<StaffPublic> staffPublic = new ArrayList<>();
		
		for(Staff staff:staffList){
			StaffPublic obj = new StaffPublic();
			obj.setName(staff.getName());
			obj.setAge(staff.getAge());
			if(staff.getName().equals("mkyong")){
				obj.setExtra("mkYong Found");
			}
			staffPublic.add(obj);
		}
		
		return staffPublic;
	}

}
