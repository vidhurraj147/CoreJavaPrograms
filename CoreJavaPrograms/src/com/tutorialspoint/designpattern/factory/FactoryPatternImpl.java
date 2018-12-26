package com.tutorialspoint.designpattern.factory;

import java.util.Scanner;

public class FactoryPatternImpl {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shapeType =  shapeFactory.getShape("c");
		shapeType.draw();
		shapeType =  shapeFactory.getShape("r");
		shapeType.draw();
		shapeType =  shapeFactory.getShape("s");
		shapeType.draw();
		shapeType = null ;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a valid ShapeType C R S?");
		if(userInput.hasNext()){
			shapeType = shapeFactory.getShape(userInput.nextLine());
			if(shapeType != null ){
				shapeType.draw();
			} else {
				System.out.println("Shape not found!!! ");
		    }
    	}
   }
}
