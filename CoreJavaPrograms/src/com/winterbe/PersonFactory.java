package com.winterbe;

public interface PersonFactory <P extends Person> {
	P create(String firstName, String lastName);
}
