package com.tutorialspoint.designpattern.builderdp;

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder() {
		robot = new Robot();
	}
	
	@Override
	public void buildRobotHead() {
		robot.setHead("TIN OLD ROBOT HEAD");
	}

	@Override
	public void buildRobotTorso() {
		robot.setTorso("TIN OLD ROBOT TORSO");
	}

	@Override
	public void buildRobotLegs() {
		robot.setLegs("TIN OLD ROBOT LEGS");
	}

	@Override
	public void buildRobotArms() {
		robot.setArms("TIN  OLD  ROBOT ARMS");
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
