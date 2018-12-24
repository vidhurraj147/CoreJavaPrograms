package com.winterbe;

public interface Formula {
	double calculate (double b);
	
	default double squareRoot(double num){
		return Math.sqrt(num);
	}

}
