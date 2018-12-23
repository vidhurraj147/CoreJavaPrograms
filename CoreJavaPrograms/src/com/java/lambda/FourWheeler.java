package com.java.lambda;

public interface FourWheeler {
	
	default void  nameIs(){
		System.out.println("I AM FourWheeler extends Vehicle");
	}
	
	static void blowHorn(){
		System.out.println("POWW POWWW");
	}

}
