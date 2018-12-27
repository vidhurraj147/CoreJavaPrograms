package com.tutorialspoint.designpattern.prototypedp;

public class TestClonig {

	public static void main(String[] args) {
		CloneFactory animalMaker = new CloneFactory();
		Sheep sally = new Sheep();
		
		Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
		
		System.out.println(sally);
		System.out.println(clonedSheep);
		System.out.println("Sally HashCode "+System.identityHashCode(sally));
		System.out.println("Clone hashCode "+System.identityHashCode(clonedSheep));

	}

}
