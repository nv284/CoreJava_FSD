package com.sim.demo3;

public interface BankOperation {
	
	void execute (BankAccount account , double amount );
	
	static void showBalance(BankAccount account) {
		System.out.println("Current Balance: $" + account.getBalance());
	}
	
	default void printOperation(String operationName) {
		System.out.println("Performing Operation: " + operationName);
	}

}
