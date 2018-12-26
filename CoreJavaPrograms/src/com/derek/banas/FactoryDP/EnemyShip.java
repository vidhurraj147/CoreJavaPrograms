package com.derek.banas.FactoryDP;

public abstract class EnemyShip {
	private String name;
	private double damaage;
	
	public String getName() {
		return name;
	}
	public double getDamaage() {
		return damaage;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDamaage(double damaage) {
		this.damaage = damaage;
	}
	
	public void followHeroShip(){
		System.out.println(getName()+" is following the hero ship!!");
	}

	public void displayEnemyShip(){
		System.out.println(getName()+" is on the screen!!");
	}
	
	public void enemyShipShoots(){
		System.out.println(getName()+" attacks and shoots "+getDamaage());
	}
}
