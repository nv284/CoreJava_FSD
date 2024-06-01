package com.sim.demo3;

public class HSBCBankAccount implements BankAccount {

	private double balance;
	
	public HSBCBankAccount(double initialBalance) {
		super();
		this.balance = initialBalance;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance = balance + amount;
		System.out.println("HSBC Bank- Deposited: $"+amount);

	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		 if (amount <= balance) {
	            balance -= amount;
	            System.out.println("HSBC Bank - Withdrew: $" + amount);
	            return true;
	        } else {
	            System.out.println("HSBC Bank - Insufficient funds.");
	            return false;
	        }
	}

}
