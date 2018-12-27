package com.tutorialspoint.designpattern.abstractdp;

public abstract class AbstractFactory {

	abstract Shape getShapeType(String shapeTypeRequested);
	abstract Color getColorType(String colorTypeRequested);
	
	// I WROTE THE LOGIC ABSTACT CLASS HAS TO BE ABSTRACT NOT FILLING MUCH
//	private AbstractFactory shapeorColorFactory = null;
//	private AbstractFactory shapeFactory = null;
//	private AbstractFactory colorFactory = null;
//	
//	public AbstractFactory getShapeorColorFactory(String shapeorColorFactoryRequested){
//		if(shapeorColorFactoryRequested.equalsIgnoreCase("s")){
//			shapeorColorFactory = new ShapeFactory();
//		}else if(shapeorColorFactoryRequested.equalsIgnoreCase("c")){
//			shapeorColorFactory = new ColorFactory();
//		} 
//		return shapeorColorFactory;
//	}
//	
//	public AbstractFactory getShapeFactory(String shapeFactoryRequested){
//		if(shapeFactoryRequested.equalsIgnoreCase("s")){
//			shapeFactory = new ShapeFactory();
//		} 
//		return shapeFactory;
//	}
//	
//	public AbstractFactory getColorFactory(String ColorFactoryRequested){
//		if(ColorFactoryRequested.equalsIgnoreCase("c")){
//			colorFactory = new ColorFactory();
//		} 
//		return colorFactory;
//	}
	
}
