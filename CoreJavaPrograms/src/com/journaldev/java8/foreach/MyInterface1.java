package com.journaldev.java8.foreach;

@FunctionalInterface
public interface MyInterface1 {
	abstract void method1(String s);
	
	default void log(){
		System.out.println("this is from MyInterface1 log()");
	}
	
	static void print(){
		System.out.println("This is from MyInterface1 print() ");
	}

}
