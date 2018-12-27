package com.tutorialspoint.designpattern.builderdp;

import java.util.ArrayList;

public class Meal {
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void additem(Item item){
		items.add(item);
	}
	
	public float getCost(){
		float itemCost = 0.0f;
		for(Item item : items){
				itemCost += item.price();
		}
		return itemCost;
	}
	
	public void showItems(){
		for(Item item : items){
			System.out.print("Item-Name: "+item.name());
			System.out.print(", Packing: "+item.packing().pack());
			System.out.println(", Price: "+item.price());
		}
	}

}
