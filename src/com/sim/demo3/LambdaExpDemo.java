package com.sim.demo3;

@FunctionalInterface
 interface FunInterface{
	int absFun(int x , int y );
	default void normalMethod() {
		System.out.println("hello");
	}
}

interface Addable{  
    int add(int a,int b);  
}  
  

public  class LambdaExpDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunInterface f1 = (int x, int  y )-> (x+y);
	    System.out.println(" result "+ f1.absFun(20, 4));
	    
	    Addable a1 = (int a , int b )->(a+a*(b+b));
	    int x = a1.add(2, 3);
	    System.out.println("Result 2 "+ x);

		

	}

	

	
}
