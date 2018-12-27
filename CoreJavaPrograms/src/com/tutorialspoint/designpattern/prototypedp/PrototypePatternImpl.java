package com.tutorialspoint.designpattern.prototypedp;

public class PrototypePatternImpl {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("main() Shape: "+clonedShape.getType());
		
		Shape clonedShape2 = ShapeCache.getShape("3");
		System.out.println("main() Shape: "+clonedShape2.getType());
		
		clonedShape2 = ShapeCache.getShape("2");
		System.out.println("main() Shape: "+clonedShape2.getType());
		
		
		Circle circle1 = (Circle) ShapeCache.getShape("1");
		System.out.println(circle1.getId());
		System.out.println(circle1.getType());
		circle1.draw();
		System.out.println("getShape()- shapeId:1 hashCode "+System.identityHashCode(circle1));
	}

}
