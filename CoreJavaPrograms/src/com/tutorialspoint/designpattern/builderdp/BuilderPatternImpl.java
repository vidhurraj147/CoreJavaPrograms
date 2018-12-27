package com.tutorialspoint.designpattern.builderdp;

public class BuilderPatternImpl {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println("vegMeal total cost "+vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println("nonVegMeal total cost "+nonVegMeal.getCost());
		
	}

}
