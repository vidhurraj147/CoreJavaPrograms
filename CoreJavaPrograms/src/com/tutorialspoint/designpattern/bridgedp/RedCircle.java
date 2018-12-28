package com.tutorialspoint.designpattern.bridgedp;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("RedCircle is drawn Radis:"+radius+", X:"+x+", Y:"+y);
	}

}
