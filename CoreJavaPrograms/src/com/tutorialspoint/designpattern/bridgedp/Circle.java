package com.tutorialspoint.designpattern.bridgedp;

public class Circle extends Shape{

	private int x,y,radius;
	
	protected Circle(int radius, int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void drawCircle(int radius, int x, int y) {
		drawAPI.drawCircle(radius, x, y);
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
