package com.java.lambda;

public interface Vehicle {
	default void nameIs(){
		System.out.println("I AM VEHICLE");
	}
}
