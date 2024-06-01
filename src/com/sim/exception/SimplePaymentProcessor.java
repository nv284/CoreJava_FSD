package com.sim.exception;

public class SimplePaymentProcessor implements PaymentProcessor {
	
	private double balance;

    public SimplePaymentProcessor(double initialBalance) {
        this.balance = initialBalance;
    }

	@Override
	public void processPayment(double amount) throws InsufficientFundsException, NetworkException {
		// TODO Auto-generated method stub
		if(Math.random()>0.8) {
			throw new NetworkException("Network connection failed during payment processing");
		}
		if(amount>balance) {
			throw new InsufficientFundsException("Insufficient funds for the payment ");
		}
		balance = balance-amount ;
		System.out.println("payment of $"+amount+ "processed successfully Remaining balance $"+balance);

	}

}
