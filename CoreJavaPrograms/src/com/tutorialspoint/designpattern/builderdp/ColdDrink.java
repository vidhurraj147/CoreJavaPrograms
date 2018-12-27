package com.tutorialspoint.designpattern.builderdp;

public abstract class ColdDrink implements Item {
	
	public Packing packing() {
		return new Bottle();
	};
	
	@Override
	public abstract float price();
	
}
