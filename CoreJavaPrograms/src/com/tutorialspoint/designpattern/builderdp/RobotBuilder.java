package com.tutorialspoint.designpattern.builderdp;

public interface RobotBuilder {
	public void buildRobotHead();
	public void buildRobotTorso();
	public void buildRobotLegs();
	public void buildRobotArms();
	public Robot getRobot();
}
