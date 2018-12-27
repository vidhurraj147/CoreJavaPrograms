package com.tutorialspoint.designpattern.abstractdp;

public class ShapeFactory extends AbstractFactory {
	private Shape shapeType;
	
	@Override
	public Shape getShapeType(String shapeTypeRequested) {
		if(shapeTypeRequested == null){
			System.out.println("ShapeType not recognised ");
		}
		
		if (shapeTypeRequested.equalsIgnoreCase("c")){
			shapeType = new Circle();
		}else if (shapeTypeRequested.equalsIgnoreCase("s")){
			shapeType = new Square();
		}else if (shapeTypeRequested.equalsIgnoreCase("r")){
			shapeType = new Rectangle();
		}
		return shapeType;
	}

	@Override
	Color getColorType(String colorTypeRequested) {
		return null;
	}
}
