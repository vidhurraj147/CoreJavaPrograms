package com.derek.banas;

public class Bird extends Animal {

	public Bird() {
		super();
		setSound("AWAAAWW AWAAWW ");
		setFlyingType(new ItFlys());
	}

}
