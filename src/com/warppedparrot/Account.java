package com.warppedparrot;

public abstract class Account {
	public static int accountNumbers;
	
	private int accountID;
	public Account() {
		this.accountID = accountNumbers+1;
	}
	
	public int getAccountID() {
		return accountID;
	}
	
	abstract public void deposit(double amount);
	
	abstract public double getBalance();
}

class SavingsAccount extends Account {
	private double amount;
	public SavingsAccount() {
		super();
	}
	
	public void deposit(double amount) {
		this.amount+=amount;
	}
	
	public double getBalance() {
		return amount;
	}
}

class CheckingAccount extends Account {
	private double amount;
	private double overdraft;
	
	public CheckingAccount(double overdraft) {
		super();
		this.overdraft=overdraft;
	}
	
	public void deposit(double amount) {
		this.amount+=amount-0.05;
	}
	
	public double getBalance() {
		return amount+overdraft;
	}
}