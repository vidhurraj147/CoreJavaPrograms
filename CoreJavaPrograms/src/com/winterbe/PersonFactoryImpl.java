package com.winterbe;

public class PersonFactoryImpl {

	public static void main(String[] args) {
		
		//OLD WAY
		PersonFactory<Person> personFactoryOLD = Person::new ;
		Person personOLD = personFactoryOLD.create("qweqwe", "oyuiytut");
		personOLD.toString();
		
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Rahul", "Kadgekar");
		person.toString();
		
	}

}
