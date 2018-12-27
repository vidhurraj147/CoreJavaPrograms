package com.tutorialspoint.designpattern.abstractdp;

public class AbstractFactoryDesignPatternIMPL {

	public static void main(String[] args) {
		FactoryProducer factoryProducer = new FactoryProducer();
		AbstractFactory colorFactory = factoryProducer.getFactory("color");
		Color color = colorFactory.getColorType("r");
		color.fill();

		
		
//		ShapeFactory shapeFactory = (ShapeFactory) abstractFactory.getShapeType("c");
//		Shape shape = shapeFactory.getShapeType("c");
//		shape.draw();
	}

}
