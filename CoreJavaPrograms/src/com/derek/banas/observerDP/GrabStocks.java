package com.derek.banas.observerDP;

public class GrabStocks {

	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);
		stockGrabber.setIbmPrice(123.0);
		stockGrabber.setApplePrice(321.0);
		stockGrabber.setGooglePrice(456.0);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setIbmPrice(123.0);
		stockGrabber.setApplePrice(321.0);
		stockGrabber.setGooglePrice(456.0);
		
		// stockGrabber.setGooglePrice(1000);
		stockGrabber.unRegister(observer1);
		stockGrabber.setIbmPrice(123.0);
		stockGrabber.setApplePrice(321.0);
		stockGrabber.setGooglePrice(456.0);
		
		
		
		Runnable getIBM = new GetTheStock(2, "IBM", 123, stockGrabber);
		Runnable getAPPLE = new GetTheStock(2, "APPLE", 321, stockGrabber);
		Runnable getGOOGLE = new GetTheStock(2, "GOOGLE", 123, stockGrabber);
		
		new Thread(getIBM).start();
		new Thread(getGOOGLE).start();
		new Thread(getAPPLE).start();

	}

}
