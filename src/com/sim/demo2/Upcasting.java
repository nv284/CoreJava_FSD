package com.sim.demo2;

 class One 
{ 
  void m1() 
  { 
     System.out.println("m1 method in class One"); 
  } 
} 
class Two extends One 
{ 
  void m2() 
  { 
     System.out.println("m2 method in class Two"); 
  } 
} 
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One o = (One)new Two(); // Upcasting. Here, superclass reference o refers to subclass object. 
		   o.m1(); 
		// o.m2(); // Compile-time error message. 
	}

}
