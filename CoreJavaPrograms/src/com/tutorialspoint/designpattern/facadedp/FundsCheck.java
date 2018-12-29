package com.tutorialspoint.designpattern.facadedp;

public class FundsCheck {

	private double cashInAccount = 1000.00;

	public double getCashInAccount() {
		return cashInAccount;
	}
	
	public void decCashInAccount(double cashWithDrawn){
		cashInAccount -= cashWithDrawn; 
	}
	
	public void incCashInAccount(double cashDeposited){
		cashInAccount += cashDeposited; 
	}

	public boolean haveEnoughMoney(double cashWithdrawal){
		if(cashWithdrawal > cashInAccount){
			System.out.println("Dont have enough money");
			System.out.println("Current balance is "+getCashInAccount());
			return false;
		} else {
			decCashInAccount(cashWithdrawal);
			System.out.println("Withdrawal complete : current balance is "+getCashInAccount());
			return true;
		}
	}
	
	public void makeDeposit(double cashToDeposit){
		incCashInAccount(cashToDeposit);
		System.out.println("Deposit complete "+getCashInAccount());
	}
	
}
