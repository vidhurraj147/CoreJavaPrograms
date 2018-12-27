package com.tutorialspoint.designpattern.prototypedp;

public class Sheep implements Animal {

	public Sheep(){
		System.out.println("SHEEP IS MADE");
	}
	
	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is being made");
		
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sheepObject;
	}
	
	public String toString(){
		return "toString from the Sheep class";
	}

}
