package com.tutorialspoint.designpattern.facadedp;

public class FacadePatternImpl {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();

	}

}
