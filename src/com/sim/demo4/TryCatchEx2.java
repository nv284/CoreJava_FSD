package com.sim.demo4;

public class TryCatchEx2 {
	
		public static void main(String args[]) {
			
		 System.out.println("111"); 
		 try 
		 { 
		   int x = 12/0; // exception occurred.
		   System.out.println("Result of x: " +x);  
		   System.out.println("333"); 
		 } 
		 catch(ArithmeticException ae) 
		 { 
		   System.out.println("Hello world"); 
		 } 
		 System.out.println("444"); 
		 } 
}
