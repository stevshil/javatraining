package com.warppedparrot;

public class Banking {
	public static void main(String[] args) {
		SavingsAccount steve;
		steve = new SavingsAccount();
		steve.deposit(20.00);
		steve.getAccountID();
		System.out.println("Steve's Balance: "+steve.getBalance());
		
		CheckingAccount bob;
		bob = new CheckingAccount(100.00);
		bob.getAccountID();
		System.out.println("Bob's initial balance: "+bob.getBalance());
		bob.deposit(20.00);
		System.out.println("Bob's current balance: "+bob.getBalance());
	}
}
