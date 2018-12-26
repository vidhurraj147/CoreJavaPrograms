package com.derek.banas.observerDP;

import java.util.ArrayList;

public class StockGrabber implements Subject{
	
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double applePrice;
	private double googlePrice;

	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer addObserver) {
		observers.add(addObserver);
	}

	@Override
	public void unRegister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Observer delete is "+observerIndex+1);
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observers){
			o.update(ibmPrice, applePrice, googlePrice);
		}
	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public double getApplePrice() {
		return applePrice;
	}

	public double getGooglePrice() {
		return googlePrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setApplePrice(double applePrice) {
		this.applePrice = applePrice;
		notifyObserver();
	}

	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserver();
	}
	
	

}
