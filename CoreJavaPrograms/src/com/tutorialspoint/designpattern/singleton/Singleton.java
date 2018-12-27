package com.tutorialspoint.designpattern.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
	
	private static Singleton firstSingleton = null;
	
	private Singleton() {
	}
	
	String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
			"b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e", 
			"e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", 
			"h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l", 
			"l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o", 
			"o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", 
			"r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u", 
			"u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

	LinkedList<String> lettersList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
	
	static boolean firstThread = true;
	
	public static Singleton getIntance(){
		
		if(firstSingleton == null){
			
			if(firstThread){
				firstThread = false;
				try {
					Thread.currentThread();
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			synchronized (Singleton.class) {
				if(firstSingleton == null){
					firstSingleton = new Singleton();
					Collections.shuffle(firstSingleton.lettersList);
				}
			}
		}
		
		return firstSingleton;
	}
	
	public LinkedList<String> getLinkedList(){
		return firstSingleton.lettersList;
	}
	
	public LinkedList<String> getTiles(int howManyTiles){
		LinkedList<String> tilesToSend = new LinkedList<String>();
		
		for(int i=0;i<howManyTiles;i++){
			tilesToSend.add(firstSingleton.lettersList.remove(0));
		}
		
		return tilesToSend;
	}
	
	
	
}
