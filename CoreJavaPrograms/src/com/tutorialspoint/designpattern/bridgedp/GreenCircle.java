package com.tutorialspoint.designpattern.bridgedp;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("GreenCircle is drawn Radis:"+radius+", X:"+x+", Y:"+y);
	}

}
