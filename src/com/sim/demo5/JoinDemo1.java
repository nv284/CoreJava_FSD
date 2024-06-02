package com.sim.demo5;

public class JoinDemo1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child thread is running");
		for(int i =1 ;i<=4;i++) {
			 System.out.println("I: " +i);
		}
		 System.out.println("Child thread is ending");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JoinDemo1 x =  new JoinDemo1();
		Thread t = new Thread(x);
		t.start();
		try {
			t.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Main thread is ending ");
	}

}
