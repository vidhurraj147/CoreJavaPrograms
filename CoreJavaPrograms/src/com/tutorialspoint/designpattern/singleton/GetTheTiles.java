package com.tutorialspoint.designpattern.singleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable{

	@Override
	public void run(){
		Singleton singleton1 = Singleton.getIntance();
		LinkedList<String> player1Tiles = singleton1.getTiles(10);
		System.out.println("Singleton1:"+System.identityHashCode(singleton1));
		
		System.out.println("Whole letterList:"+singleton1.lettersList);
		System.out.println("After modification:"+singleton1.lettersList);
		System.out.println("player1TilesList:"+player1Tiles);
		
//		Singleton singleton2 = Singleton.getIntance();
//		System.out.println(singleton2);
//		System.out.println(System.identityHashCode(singleton2));
//		
		
		
//		Singleton singleton2 = Singleton.getIntance();
//		LinkedList<String> player2Tiles = singleton2.getTiles(10);
//		System.out.println("Singleton2:"+System.identityHashCode(singleton2));
	}
}
