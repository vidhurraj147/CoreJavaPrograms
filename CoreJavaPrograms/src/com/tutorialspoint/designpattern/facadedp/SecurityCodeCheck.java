package com.tutorialspoint.designpattern.facadedp;

public class SecurityCodeCheck {
	
	private int securityCode = 1234;
	
	public int getAccountNumber(){
		return securityCode;
	}
	
	public boolean isCodeCorrect(int securityCode){
		if(this.securityCode == securityCode){
			return true;
		}else {
			return false;
		}
	}

}
