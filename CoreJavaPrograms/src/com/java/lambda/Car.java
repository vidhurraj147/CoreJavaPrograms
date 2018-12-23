package com.java.lambda;

public class Car implements Vehicle, FourWheeler {
	public void nameIs(){
		Vehicle.super.nameIs();
		FourWheeler.super.nameIs();
		FourWheeler.blowHorn();
	}
}
