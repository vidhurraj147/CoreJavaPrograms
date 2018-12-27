package com.tutorialspoint.designpattern.prototypedp;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String,Shape>();
	
	public static Shape getShape(String shapeId){
		Shape cachedShape = shapeMap.get(shapeId);
		System.out.println("getShape()- shapeId:"+shapeId+" hashCode "+System.identityHashCode(cachedShape));
		return (Shape) cachedShape.clone();
	}
	
	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		System.out.println("getShape()- shapeId: 1,  hashCode "+System.identityHashCode(circle));
		shapeMap.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
		
		Square square = new Square();
		square.setId("3");
		shapeMap.put(square.getId(), square);
		
	}
	
}
