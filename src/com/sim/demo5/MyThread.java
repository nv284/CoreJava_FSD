package com.sim.demo5;

public class MyThread extends Thread {
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("New Thread running ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Main thread running");	 
		 
		 MyThread th = new MyThread();
		 
		// Create an object of Thread class and pass the object reference variable th.   
		 Thread t = new Thread(th);
		 
		// Now run thread on the object. For this, call start() method using reference variable t.   
		 t.start();// This thread will execute statements inside run() method of MyThread object.
	}

}
