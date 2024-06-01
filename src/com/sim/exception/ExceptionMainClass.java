package com.sim.exception;

public class ExceptionMainClass {

	public static void main(String[] args) throws NetworkException {
		// TODO Auto-generated method stub
PaymentProcessor process = new SimplePaymentProcessor(500.00);

double[] paymentAmounts = {200.00, 300.00, 600.00, 100.00};

for(double amount : paymentAmounts) {
	try {
		System.out.println("Attempting to process payment "+amount );
		process.processPayment(amount);
	}catch (InsufficientFundsException e) {
		// TODO: handle exception
		System.err.println("Payment failed: " + e.getMessage());
	}
	catch (NetworkException e) {
		// TODO: handle exception
		 System.err.println("Payment failed: " + e.getMessage());
	}finally {
		 System.out.println("Cleaning up resources after payment attempt.");
	}
}

	}

}
