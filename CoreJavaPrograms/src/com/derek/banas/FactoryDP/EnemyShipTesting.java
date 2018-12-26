package com.derek.banas.FactoryDP;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		EnemyShip theEnemy = null;
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		System.out.println("Select your option U/R/B? ");
		Scanner userInput = new Scanner(System.in);
		if(userInput.hasNext()){
			String userSelection  = userInput.next();
			theEnemy = shipFactory.makeEnemyShipFactory(userSelection);
			
		}
		// Regular way of assiging which is not actually implementing FACTORY design pattern 
//		// UFOEnemyShip ufoEnemyShip = new UFOEnemyShip();
//		EnemyShip theEnemy = null ;
//		Scanner userInput = new Scanner(System.in);
//		String enemyShipOption = "";
//		System.out.println("Select your option U/R? ");
//		if(userInput.hasNextLine()){
//			enemyShipOption = userInput.nextLine();
//		}
//		if(enemyShipOption.equalsIgnoreCase("U")){
//			theEnemy = new UFOEnemyShip();
//		}else if (enemyShipOption.equalsIgnoreCase("R")) {
//			theEnemy = new RocketEnemyShip();
//		}
//		
		if(theEnemy != null){
			doStuffEnemy(theEnemy);
		}else System.out.println("That option doesnt exist!!! ");
	}

	private static void doStuffEnemy(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
		
	}

}
