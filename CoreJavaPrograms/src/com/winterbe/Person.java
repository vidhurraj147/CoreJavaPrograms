package com.winterbe;

public class Person {
	String firstName;
	String lastName;
	
	
	Person(){
		
	}
	
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString(){
		System.out.println("FirstName "+this.firstName+", lastName"+this.lastName);
		return "";
	}
	
}
