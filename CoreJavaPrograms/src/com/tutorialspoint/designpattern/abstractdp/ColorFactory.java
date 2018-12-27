package com.tutorialspoint.designpattern.abstractdp;

public class ColorFactory extends AbstractFactory{
	private Color colorType;
	
	@Override
	public Color getColorType(String colorTypeRequested) {
		if(colorTypeRequested == null){
			System.out.println("ShapeType not recognised ");
		}
		
		if (colorTypeRequested.equalsIgnoreCase("r")){
			colorType = new Red();
		}else if (colorTypeRequested.equalsIgnoreCase("b")){
			colorType = new Blue();
		}else if (colorTypeRequested.equalsIgnoreCase("g")){
			colorType = new Green();
		}
		return colorType;
	}
	
	@Override
	public Shape getShapeType(String shapeTypeRequested){
		return null;
	}

}
