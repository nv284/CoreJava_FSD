package com.sim.demo5;

public class WaitNotifyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Message msg = new Message("process it ");
   Waiter  wait = new Waiter(msg);
   Thread t = new Thread(wait, "waiter");
   t.start();
   
   Waiter wait1 = new Waiter(msg);
   Thread t1 = new Thread(wait1, "waiter1");
   t1.start();
   
   Notifier no = new Notifier(msg);
   
   Thread t2 = new Thread(no, "notifier");
   t2.start();
	}

}
