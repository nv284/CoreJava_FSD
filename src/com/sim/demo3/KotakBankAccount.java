package com.sim.demo3;

public class KotakBankAccount implements BankAccount {
	private double balance;

    public KotakBankAccount(double initialBalance) {
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
		balance += amount;
        System.out.println("Kotak Bank - Deposited: $" + amount);
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		 if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Kotak Bank - Withdrew: $" + amount);
	            return true;
	        } else {
	            System.out.println("Kotak Bank - Insufficient funds.");
	            return false;
	        }
	}

}
