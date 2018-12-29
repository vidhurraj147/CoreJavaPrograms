package com.tutorialspoint.designpattern.facadedp;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck accountNumberCheck;
	SecurityCodeCheck securityCodeCheck;
	FundsCheck fundsCheck;
	
	WelcomeToBank welcomeToBank;

	public BankAccountFacade(int accountNumber, int securityCode) {
		super();
		this.accountNumber = accountNumber;
		this.securityCode = securityCode;
		
		accountNumberCheck = new AccountNumberCheck();
		securityCodeCheck = new SecurityCodeCheck();
		fundsCheck = new FundsCheck();
		welcomeToBank = new WelcomeToBank();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void withDrawCash(double withDrawCash) {
		if(accountNumberCheck.accountActive(getAccountNumber())
			&& securityCodeCheck.isCodeCorrect(getSecurityCode())
			&& fundsCheck.haveEnoughMoney(withDrawCash)){
			System.out.println("-- Transaction COMPLETE --");
		}else{
			System.out.println("-- Transaction FAILED--");
		}
		
	}

	public void withDeposit(double withDeposit) {
		if(accountNumberCheck.accountActive(getAccountNumber())
				&& securityCodeCheck.isCodeCorrect(getSecurityCode())){
				fundsCheck.makeDeposit(withDeposit);
				System.out.println("-- Transaction COMPLETE --");
			}else{
				System.out.println("-- Transaction FAILED--");
			}
	}

	
	
	
}
