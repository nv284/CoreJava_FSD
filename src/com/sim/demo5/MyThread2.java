package com.sim.demo5;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("new Thread running ");
		for(int i = 1;i<=5;i++) {
			System.out.println(i);
		}
      System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		System.out.println(" Main thread running ");
		MyThread2 th = new MyThread2();   // Main Thread 
		
		Thread t = new Thread(th);
		
		t.start();// This thread will execute statements inside run() method of MyThread object.
	}
}
