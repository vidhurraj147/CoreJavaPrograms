package com.tutorialspoint.designpattern.prototypedp;

public abstract class Shape implements Cloneable{
	public String id;
	public String type;
	
	abstract void draw();
	
	public String getType(){
		return type;
	}
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		 this.id = id;
	}
	public Object clone(){
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clone;
		
	}
}
