package com.tutorialspoint.designpattern.builderdp;

public class MealBuilder{
	
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.additem(new VegBurger());
		meal.additem(new Coke());
		
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.additem(new ChickenBurger());
		meal.additem(new Pepsi());
		
		return meal;
	}
	
}



//public class MealBuilder {
//	private Meal vegMeal = null;
//	private Meal nonVegMeal = null;
//	
//	public MealBuilder() {
//		vegMeal = new Meal();
//		nonVegMeal = new Meal();
//	}
//	
//	
//	public Meal prepareVegMeal(){
//		vegMeal.additem(new VegBurger());
//		vegMeal.additem(new Coke());
//		return vegMeal;
//	}
//	
//	public Meal prepareNonVegMeal(){
//		nonVegMeal.additem(new ChickenBurger());
//		nonVegMeal.additem(new Pepsi());
//		return nonVegMeal;
//	}
//
//}
