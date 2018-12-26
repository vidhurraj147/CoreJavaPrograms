package com.derek.banas;

public class Animal {
	private String name;
	private double weight;
	private String sound;
	
	private Flys flyingType;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if(weight > 0 ){
			this.weight = weight;
		}else{
			System.out.println("Weigth has to be greater than 0 ");
		}
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void setFlyingType(Flys FlyingType){
		this.flyingType = FlyingType;
	}
	
//	public Flys getFlytingType(){
//		return this.flyingType;
//	}
	
	public String tryToFly(){
		return this.flyingType.fly();
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", sound=" + sound + "]";
	}
}
