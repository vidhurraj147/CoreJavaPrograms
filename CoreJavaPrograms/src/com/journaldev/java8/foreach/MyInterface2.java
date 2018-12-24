package com.journaldev.java8.foreach;

@FunctionalInterface
public interface MyInterface2 {
	abstract void method2();
	
	default void log(){
		System.out.println("This is from MyInterface2 log()");
	}
}
