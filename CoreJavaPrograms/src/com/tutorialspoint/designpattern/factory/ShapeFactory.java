package com.tutorialspoint.designpattern.factory;

public class ShapeFactory {
	
	Shape shapeType = null;
	
	public Shape getShape(String requestedShape){
		shapeType = null ;
		if(requestedShape.equalsIgnoreCase("S")){
			return shapeType = new Square();
		}else if(requestedShape.equalsIgnoreCase("R")){
			return shapeType = new Rectangle();
		}else if(requestedShape.equalsIgnoreCase("C")){
			return shapeType = new Circle();
		}
		return shapeType;
	}
}
