package com.tutorialspoint.designpattern.abstractdp;

public class FactoryProducer {
	private AbstractFactory abstractFactory = null;
	
	public AbstractFactory getFactory(String abstractFactoryTypeRequested){
		if(abstractFactoryTypeRequested.equalsIgnoreCase("shape")){
			abstractFactory = new ShapeFactory();
		}else if(abstractFactoryTypeRequested.equalsIgnoreCase("color")){
			abstractFactory = new ColorFactory();
		}
		return abstractFactory;
	}
	
}
