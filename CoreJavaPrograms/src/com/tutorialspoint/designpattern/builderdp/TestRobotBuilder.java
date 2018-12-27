package com.tutorialspoint.designpattern.builderdp;

public class TestRobotBuilder {
	
	public static void main(String[] args){
		RobotBuilder oldStyle = new OldRobotBuilder();
		RobotEngineer robotEngineer = new RobotEngineer(oldStyle);
		robotEngineer.makeRobot();
		Robot firstRobot = robotEngineer.getRobot();
		System.out.println("Robot Built");
		System.out.println(firstRobot.getArms());
		System.out.println(firstRobot.getHead());
		System.out.println(firstRobot.getLegs());
		System.out.println(firstRobot.getTorso());
	}

}
