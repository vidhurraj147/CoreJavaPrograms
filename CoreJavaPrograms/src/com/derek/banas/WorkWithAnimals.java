package com.derek.banas;

public class WorkWithAnimals {
	public static void main(String[] args){
		Animal fido = new Dog();
		fido.setName("fido_setName");
		fido.setWeight(-1);
		System.out.println(fido.toString());
		((Dog) fido).digHole();
		
		Dog fido2 = new Dog();
		System.out.println(fido2.tryToFly());
		
		Bird kake = new Bird();
		kake.setName("kake");
		System.out.println(kake.toString());
		System.out.println(kake.tryToFly());
		fido2.setFlyingType(new ItFlys());
		System.out.println(fido2.tryToFly());
		
	}
}
