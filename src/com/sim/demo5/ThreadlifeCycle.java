package com.sim.demo5;

class ThreadDemo extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i = 1;i<=5;i++) {
			try {
				Thread.sleep(1000); //t1 
				System.out.println( Thread.currentThread().getId()+" value "+i);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
	
}

public class ThreadlifeCycle  {

	public static void main(String args[]) {
		//creating thread in java 
		ThreadDemo t1 = new ThreadDemo();//newborn state 
		ThreadDemo t2 = new ThreadDemo();//newborn state 
		ThreadDemo t3 = new ThreadDemo();//newborn state 
		// thread entering into runnable state 
		t1.start();
		//thread methods in java - setting priority of t2 to max(10)
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		//checking if t1 is alive 
		System.out.println("is thread t1 alive "+ t1.isAlive());
		//waiting for t1 to die
		try {
			t1.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		t3.start();
		//thread methods in java - setting priority of t2 to min(1)
		t3.setPriority(Thread.MIN_PRIORITY);
		 
		System.out.println("is thread t1 alive "+ t1.isAlive());
		
	}
}
