package com.tutorialspoint.designpattern.filterorcriteriadp;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMarried implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> marriedPersons = new ArrayList<Person>();
		
		for(Person person : persons){
			if(person.getMaritalStatus().equalsIgnoreCase("married")){
				marriedPersons.add(person);
			}
		}
		return marriedPersons;
	}

}
