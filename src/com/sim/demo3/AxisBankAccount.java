package com.sim.demo3;

public class AxisBankAccount implements BankAccount {
	
	private double balance;
	
	public AxisBankAccount(double initialBalance) {
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
		System.out.println("Axis Bank- Deposited: $"+amount);
		
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount <= balance) {
			balance = balance - amount ;
		System.out.println("Axis Bank - Withdrew : $" + amount);
		return true;
	}else {
		System.out.println(" Axis Bank - Insufficient funds ");
		return false;
	}

}
}