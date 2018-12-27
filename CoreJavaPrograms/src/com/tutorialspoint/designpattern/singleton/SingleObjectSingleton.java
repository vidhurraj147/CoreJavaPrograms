package com.tutorialspoint.designpattern.singleton;

public class SingleObjectSingleton {
	
	private static SingleObjectSingleton singleObjectSingleton = new SingleObjectSingleton();
	
	private SingleObjectSingleton(){
		
	}
	
	public static SingleObjectSingleton getInstance(){
		return singleObjectSingleton;
	}
	
	public void helloWorld(){
		System.out.println("Hello World");
	}

}
