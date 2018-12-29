package com.tutorialspoint.designpattern.facadedp;

public class TestBankAccountFacade {

	public static void main(String[] args) {
		BankAccountFacade accessingBank = new BankAccountFacade(123456,1234);
		accessingBank.withDrawCash(50.00);
		accessingBank.withDrawCash(900.00);
		accessingBank.withDeposit(200.00);

	}

}
