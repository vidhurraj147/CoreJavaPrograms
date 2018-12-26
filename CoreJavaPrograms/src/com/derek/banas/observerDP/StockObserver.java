package com.derek.banas.observerDP;

public class StockObserver implements Observer{

	private double ibmPrice;
	private double applePrice; 
	private double googlePrice;
	
	private static int observerIDTracker = 0;
	
	private int observerId;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		observerId = ++observerIDTracker;
		System.out.println("ObserverId "+observerId);
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double applePrice, double googlePrice) {
		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice; 
		this.googlePrice = googlePrice;
		printThePrices();
	}

	public void printThePrices() {
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "StockObserver \n [ibmPrice=" + ibmPrice + "\n , applePrice=" + applePrice + "\n , googlePrice=" + googlePrice
				+ "\n , observerId=" + observerId +"]";
	}
	
	
}