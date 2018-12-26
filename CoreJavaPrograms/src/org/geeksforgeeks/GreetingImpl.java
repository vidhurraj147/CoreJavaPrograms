package org.geeksforgeeks;

public class GreetingImpl {

	public static void main(String[] args) {
		Greeting greet1 = () -> System.out.println("This will execute"); 
		greet1.getGreet();
		
	}
}
