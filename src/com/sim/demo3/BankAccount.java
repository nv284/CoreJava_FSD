package com.sim.demo3;

public interface BankAccount {

	
   double getBalance();
   void deposit(double amount);
   boolean withdraw(double amount);

   default void showAccountDetails() {
       System.out.println("Bank Account Details:");
       BankOperation.showBalance(this);
   }
	   
}
