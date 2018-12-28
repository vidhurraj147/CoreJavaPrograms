package com.tutorialspoint.designpattern.filterorcriteriadp;

import java.util.ArrayList;
import java.util.List;

public class FilterORCriteriaImpl {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

	      persons.add(new Person("Robert","Male", "Single"));
	      persons.add(new Person("John", "Male", "Married"));
	      persons.add(new Person("Laura", "Female", "Married"));
	      persons.add(new Person("Married_John", "Female", "Married"));
	      persons.add(new Person("Married_Laura", "Female", "Married"));
	      persons.add(new Person("Diana", "Female", "Single"));
	      persons.add(new Person("Mike", "Male", "Single"));
	      persons.add(new Person("Bobby", "Male", "Single"));
	      
	      Criteria male = new CriteriaMale();
	      Criteria feMale = new CriteriaFemale();
	      Criteria single = new CriteriaSingle();
	      
	      
	      Criteria singleMale = new AndCriteria(single, male);
	      Criteria singleOrFemale = new OrCriteria(single, feMale);
	      
	      System.out.println("Males: ");
	      printPersons(male.meetCriteria(persons));

	      System.out.println("\nFemales: ");
	      printPersons(feMale.meetCriteria(persons));
	      
	      System.out.println("\nSingles: ");
	      printPersons(single.meetCriteria(persons));
	      
	      System.out.println("\nSingle Males: ");
	      printPersons(singleMale.meetCriteria(persons));

	      System.out.println("\nSingle Or Females: ");
	      printPersons(singleOrFemale.meetCriteria(persons));
	      
	      Criteria marriedPerson = new CriteriaMarried();
	      Criteria marriedandMale = new AndCriteria(marriedPerson, male);
	      System.out.println("\nMarried AND Male: ");
	      printPersons(marriedandMale.meetCriteria(persons));
	      
	      // Criteria marriedPersonNew = new CriteriaMarried();
	      Criteria marriedandFemale = new AndCriteria(marriedPerson, feMale);
	      System.out.println("\nMarried AND Female: ");
	      printPersons(marriedandFemale.meetCriteria(persons));
	      
	}
	
	public static void printPersons(List<Person> persons){
	      for (Person person : persons) {
	         System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
	      }
	   } 

}
