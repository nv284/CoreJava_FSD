package com.sim.demo2;

public class MethodOverLoadTest {

	void sum(int a , int b) {
		int s = a+b;
		System.out.println("result "+s);
	}
	
	void sum(int a , int b , int c ) {
		int t = a+b+c;
		System.out.println("result = "+t);
	}
	
	void sum(Float a , int b , int c ) {
		Float t = a+b+c;
		System.out.println("result = "+t);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MethodOverLoadTest test1 = new MethodOverLoadTest();
    
         test1.sum(13, 200);
         test1.sum(100, 200, 456);
         test1.sum(2.3f, 20, 56);
	}

}
