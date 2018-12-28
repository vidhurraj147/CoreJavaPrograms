package com.tutorialspoint.designpattern.filterorcriteriadp;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePerson = new ArrayList<Person>();
		
		for(Person person : persons){
			if(person.getGender().equalsIgnoreCase("female")){
				femalePerson.add(person);
			}
		}
		return femalePerson;
	}
}
