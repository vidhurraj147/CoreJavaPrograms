package com.tutorialspoint.designpattern.prototypedp;

public class CloneFactory {
	
	public Animal getClone(Animal animalSample){
		return animalSample.makeCopy();
	}
	
}
