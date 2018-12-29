package com.tutorialspoint.designpattern.facadedp;

public class AccountNumberCheck {
	
	private int accountNumber = 123456;
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public boolean accountActive(int accountNumber){
		if(this.accountNumber == accountNumber){
			return true;
		}else {
			return false;
		}
	}

}
