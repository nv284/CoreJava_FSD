package com.sim.exception;

public interface PaymentProcessor {

	void processPayment(double amount )throws InsufficientFundsException , NetworkException;
}
