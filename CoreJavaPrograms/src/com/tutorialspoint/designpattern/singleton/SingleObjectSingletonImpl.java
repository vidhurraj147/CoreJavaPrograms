package com.tutorialspoint.designpattern.singleton;

public class SingleObjectSingletonImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObjectSingleton singleObjectSingleton1 = SingleObjectSingleton.getInstance();
		SingleObjectSingleton singleObjectSingleton2 = SingleObjectSingleton.getInstance();
		System.out.println(singleObjectSingleton1);
		System.out.println(singleObjectSingleton2);
		System.out.println(System.identityHashCode(singleObjectSingleton1));
		System.out.println(System.identityHashCode(singleObjectSingleton2));
			
		// This throws a compilation error
		// SingleObjectSingleton singleObjectSingleton = new SingleObjectSingleton();

	}

}
