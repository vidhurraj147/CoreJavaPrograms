package com.journaldev.java8.foreach;

public class FunctionalInterfaceImpl implements MyInterface1,MyInterface2 {

	public static void main(String[] args) {
		FunctionalInterfaceImpl fii = new FunctionalInterfaceImpl();
		fii.log();

		// ================================= Lambda Implementation Runnable Interface
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable direct/regular implementaion");
			}
		};
		
		Runnable run2 = () -> System.out.println("This is Lambda implementaion");
		
		runnable.run();
		run2.run();
		
		MyInterface1 mI1 = (s) -> System.out.println(s);
		mI1.method1("added from the class FII ");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log() {
		// TODO Auto-generated method stub
		MyInterface1.super.log();
		MyInterface2.super.log();
		System.out.println("this is from class FunctionalInterFaceImpl ");
	}

	@Override
	public void method1(String s) {
		// TODO Auto-generated method stub
		
	}
	
}
