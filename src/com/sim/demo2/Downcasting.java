package com.sim.demo2;
 class One1 
{ 
  void m1() 
  { 
     System.out.println("m1 method in class One"); 
  } 
} 
 class Two2 extends One1 
{ 
   void m2() 
   { 
      System.out.println("m2 method in class Two"); 
   } 
} 
public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One1 o = new Two2(); // Superclass reference refers to subclass object. 
	      Two2 t = (Two2)o; // Converting super class reference type into subclass reference type. 
	      
	      t.m1(); // Calling m1 method using reference variable of subclass. 
	      t.m2(); // Calling m1 method using reference variable of subcl
	}

}
