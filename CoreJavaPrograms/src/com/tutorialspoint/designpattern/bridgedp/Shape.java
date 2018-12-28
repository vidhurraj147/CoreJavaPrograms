package com.tutorialspoint.designpattern.bridgedp;

public abstract class Shape implements DrawAPI{
	
	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	public abstract void draw();

}
