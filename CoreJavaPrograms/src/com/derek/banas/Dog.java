package com.derek.banas;

public class Dog extends Animal {
	
	public void digHole(){
		System.out.println("Dug a hole ");
	}
	
	public Dog(){
		super();
		setSound("BARK!!! ");
		setFlyingType(new CantFly());
	}
	
}
