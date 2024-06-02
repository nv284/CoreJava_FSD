package com.sim.demo5;

public class MyThread3 implements Runnable {
	//instance variable 
   int a = 20 ; int b =10;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		addition();
		subtraction();
		multiplication();
		
	}
	void addition() {
		  int sum =  a +  b;
		    System.out.println("Addition of two numbers: " +sum);
	}
    void subtraction() {
    	int sub = a - b;
        System.out.println("Subtraction of two numbers: " +sub);
    }
    void multiplication() {
    	int multiply = a * b;
        System.out.println("Multiplication of two numbers: " +multiply);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread3 th = new MyThread3();
        // Normal way to call the method in java program 
      //  th.addition();th.subtraction();th.multiplication();
        
        Thread ta = new Thread(th); // New state 
        
        Thread tb = new Thread(th);
        
        ta.start();
        tb.start();
	}

}
