package com.sim.demo5;

public class ThreadsleepTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello");	
		  try
		  {
		    Thread.sleep(2000); // Pausing running thread for 2 sec.
		  }
		  catch(InterruptedException ie) {
		    System.out.println(ie.getMessage());	
		  }
		  System.out.println("Java");
		  System.out.println(Thread.currentThread());
		}
		void m1()
		{
		   System.out.println("m1 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadsleepTest a = new ThreadsleepTest();
		   Thread t = new Thread(a, "Child Thread");
		   t.start();
		   System.out.println("Number of active threads: " +Thread.activeCount());
		   a.m1();
	}

}
