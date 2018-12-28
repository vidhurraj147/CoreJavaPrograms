package com.tutorialspoint.designpattern.bridgedp;

public class BridgePatternImpl {

	public static void main(String[] args) {
		Shape redCircle = new Circle(500, 60, 90, new RedCircle());
		redCircle.draw();
		
		Shape greenCircle = new Circle(500, 60, 90, new GreenCircle());
		greenCircle.draw();
		
		DrawAPI drawAPIRedCircle = new RedCircle();
		Shape shape = new Circle(100, 10, 20, drawAPIRedCircle);
		shape.draw();
		shape.drawCircle(200, 20, 30);
		
		DrawAPI drawAPIGreeenCircle = new GreenCircle();
		Shape shapeGreen = new Circle(500, 50, 90, drawAPIGreeenCircle);
		shapeGreen.draw();
		shapeGreen.drawCircle(900, 50, 60);

	}

}
