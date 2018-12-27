package com.tutorialspoint.designpattern.builderdp;

public class Robot implements RobotPlan {
	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	
	@Override
	public void setHead(String head) {
		this.robotHead = head;
	}
	
	public String getHead(){
		return this.robotHead;
	}

	@Override
	public void setArms(String arms) {
		this.robotArms = arms;
	}
	
	public String getArms(){
		return this.robotArms;
	}

	@Override
	public void setTorso(String torso) {
		this.robotTorso = torso;
	}
	
	public String getTorso(){
		return this.robotTorso;
	}

	@Override
	public void setLegs(String legs) {
		this.robotLegs = legs;
	}
	
	public String getLegs(){
		return this.robotLegs;
	}
}
