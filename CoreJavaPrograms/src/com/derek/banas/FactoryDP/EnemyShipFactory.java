package com.derek.banas.FactoryDP;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShipFactory(String newShipType){
		EnemyShip newShip = null;
		if(newShipType.equalsIgnoreCase("U")){
			return new UFOEnemyShip();
		}else if(newShipType.equalsIgnoreCase("B")){
			return new BigUFOEnemyShip();
		}else if(newShipType.equalsIgnoreCase("R")){
			return new RocketEnemyShip();
		}
		return newShip;
	}

}
