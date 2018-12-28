package com.tutorialspoint.designpattern.adapterdp;

public class TestEnemyAttacker {

	public static void main(String[] args) {
		
		EnemyTank rxTank = new EnemyTank();
		EnemyRobot fredRobot = new EnemyRobot();
		EnemyAttacker robotAdapter = new EnemyRobotAbapter(fredRobot);
		
		System.out.println("The Robot");
		fredRobot.reactToHuman("Paul");
		fredRobot.walkForward();
		fredRobot.smashWithHands();

		System.out.println("The Enemy tank");
		rxTank.assignDriver("Frank");
		rxTank.driveForward();
		rxTank.fireWeapon();
		
		System.out.println("The Robot WITH ADAPTER ");
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}

}
