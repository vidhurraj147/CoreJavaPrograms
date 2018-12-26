package com.derek.banas.observerDP;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

	private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber;

	public GetTheStock(int startTime, String stock, double price, Subject stockGrabber) {
		super();
		this.startTime = startTime;
		this.stock = stock;
		this.price = price;
		this.stockGrabber = stockGrabber;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			double randomNumber = (Math.random() * 0.06 ) - 0.03;
			DecimalFormat df = new DecimalFormat("#.##");
			price = Double.parseDouble(df.format(price + randomNumber));
			
			if(stock.equalsIgnoreCase("IBM")) ((StockGrabber) stockGrabber).setIbmPrice(price);
			if(stock.equalsIgnoreCase("APPLE")) ((StockGrabber) stockGrabber).setApplePrice(price);
			if(stock.equalsIgnoreCase("GOOGLE")) ((StockGrabber) stockGrabber).setGooglePrice(price);
			
			System.out.print("Stock :"+stock+"[price:"+df.format(price)+"[by an amount :"+df.format(randomNumber));
			System.out.println();
			
			
		}
		
	}
	
	
}
