package com.tutorialspoint.designpattern.prototypedp;

public class Square extends Shape {
	
	public Square(){
		type = "Square";
	}

	@Override
	void draw() {
		System.out.println(" Square is DRAWN inside the draw() "+type);
	}
	
}
