package com.tutorialspoint.designpattern.prototypedp;

public class Circle extends Shape {
	
	public Circle(){
		type = "Circle";
	}

	@Override
	void draw() {
		System.out.println(" Circle is DRAWN inside the draw() "+type);
	}
	
}
