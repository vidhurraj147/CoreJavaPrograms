package com.tutorialspoint.designpattern.filterorcriteriadp;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePerson = new ArrayList<Person>();
		
		for(Person person : persons){
			if(person.getGender().equalsIgnoreCase("male")){
				malePerson.add(person);
			}
		}
		return malePerson;
	}
}