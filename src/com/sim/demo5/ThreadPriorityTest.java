package com.sim.demo5;
/*The priority of Thread t1 is 4, t2 is 2, and t3 is 8. Thread t3 is the highest priority as compared to t1 and t2.
 *  But it is not necessary that you will get the same priorities when you will run multiple times.*/

public class ThreadPriorityTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println(Thread.currentThread()); // This method is static.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriorityTest a = new ThreadPriorityTest();
		Thread t1 = new Thread(a, "First Thread");
		   Thread t2 = new Thread(a, "Second Thread");
		   Thread t3 = new Thread(a, "Third Thread");
		 
		   t1.setPriority(4); // Setting priority of the first thread.
		   t2.setPriority(2); // Setting priority of the second thread.
		   t3.setPriority(8); // Setting priority of the third thread.
		 
		   t1.start();
		   t2.start();
		   t3.start();
	}

}
