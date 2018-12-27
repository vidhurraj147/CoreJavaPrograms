package com.tutorialspoint.designpattern.singleton;

import java.util.LinkedList;

public class SingletonImpl {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getIntance();
		System.out.println(singleton1);
		System.out.println(System.identityHashCode(singleton1));
		
		System.out.println("Whole letterList:"+singleton1.lettersList);
		LinkedList<String> player1Tiles = singleton1.getTiles(7);
		System.out.println("After modification:"+singleton1.lettersList);
		System.out.println("player1TilesList:"+player1Tiles);
		
		Singleton singleton2 = Singleton.getIntance();
		System.out.println(singleton2);
		System.out.println(System.identityHashCode(singleton2));
		
		System.out.println("Before List:"+singleton2.lettersList);
		LinkedList<String> player2List = singleton2.getTiles(10);
		System.out.println("After modification:"+singleton1.lettersList);
		System.out.println("player1TilesList:"+player2List);
		
		
		// This throws compile time exception because contrustor is private 
//		Singleton singleton3 = new Singleton();
//		System.out.println(singleton3);

	}

}
