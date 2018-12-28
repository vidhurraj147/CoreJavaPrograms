package com.tutorialspoint.designpattern.adapterdp;

public class EnemyRobotAbapter implements EnemyAttacker {

	EnemyRobot theRobot;
	
	public EnemyRobotAbapter(EnemyRobot enemyRobot) {
		this.theRobot = enemyRobot; 
	}
	
	@Override
	public void fireWeapon() {
		theRobot.smashWithHands();
	}

	@Override
	public void driveForward() {
		theRobot.walkForward();
	}

	@Override
	public void assignDriver(String driverName) {
		theRobot.reactToHuman(driverName);
	}

}
