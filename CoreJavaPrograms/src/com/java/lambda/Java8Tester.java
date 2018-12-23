package com.java.lambda;


public class Java8Tester {

	public static void main(String[] args) {
		Java8Tester tester = new Java8Tester();
		System.out.println("Java 8");
		MathOperation addition = (int a,int b) -> a+b;
		System.out.println("Addition is "+tester.operate(10, 5, addition));
		// int i=10,j=20;
		MathOperation addition2 = (int i,int j) -> i+j;
		System.out.println(addition2.process(30, 50));
		
	}
	
	private int operate(int a, int b, MathOperation operation) {
		return operation.process(a, b);
	}
}
