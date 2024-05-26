package com.sim.demo2;

 abstract  class PayTmPaymentGatway{
	 
	 private boolean isBankInterfaceUp= true;
	 //non-abstract 
	void pay(int amount) {
		if(isBankInterfaceUp) {
			System.out.println("PayTm payment successfully done for Amount "+amount );
			onSuccess("[PayTM] 101 - Payment success");
		}else {
			System.out.println("payment failed ");
			onFailure("[PayTM] 201 - payment failed ");
		}
	}
	//abstract methods 
	abstract void onSuccess(String msg);
	abstract void onFailure(String msg);
}
class EStorePayment extends PayTmPaymentGatway{
	

	public EStorePayment() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Estore construtor ");
	}

	@Override
	void onSuccess(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		System.out.println("Estore Thanks you for placing the order . it shall be dispatched soon");
		
	}

	@Override
	void onFailure(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		System.out.println("Estore somthing went wrong  .Please try after some time ");
		
	}
	
	
}

class Amazon extends PayTmPaymentGatway{

	@Override
	void onSuccess(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void onFailure(String msg) {
		// TODO Auto-generated method stub
		
	}
	
}

class Flipkart extends PayTmPaymentGatway {

	@Override
	void onSuccess(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void onFailure(String msg) {
		// TODO Auto-generated method stub
		
	}
	
}
public class PaymentsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   EStorePayment es = new EStorePayment();
   es.pay(3000);
	}

}
