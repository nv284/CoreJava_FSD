package com.sim.demo2;

public interface HelpInterface {

	public void myMethod();
	public void call();
	public int pay(int amount);
	public int cal(int x , int y , int z);
}

@FunctionalInterface
interface NewInterface {
	/*
	 * must have one single abstract method that's why it also known as SAM 
	 * it can have default method 
	 * it can have static methods 
	 * */
	int method1();
	default int add(int a, int b){
        return a+b;
    }
	 static int multiply(int a, int b){
	        return a*b;
	    }
	
}