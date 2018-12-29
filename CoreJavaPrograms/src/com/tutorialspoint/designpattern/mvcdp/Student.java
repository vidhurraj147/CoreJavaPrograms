package com.tutorialspoint.designpattern.mvcdp;

public class Student {

	private String rollNo;
	private String name;
	
	public String getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}
