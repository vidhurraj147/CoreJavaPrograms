package com.tutorialspoint.designpattern.prototypedp;

public class Rectangle extends Shape {
	
	public Rectangle(){
		type = "Rectangle";
	}

	@Override
	void draw() {
		System.out.println(" Rectangle is DRAWN inside the draw() "+type);
	}
	
}
