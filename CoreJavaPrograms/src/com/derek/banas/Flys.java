package com.derek.banas;


// Strategy Design Pattern

public interface Flys {
	String fly();
}

class ItFlys implements Flys{
	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Flying HIGH";
	}
}

class CantFly implements Flys{
	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "I CANNOT FLY";
	}
}