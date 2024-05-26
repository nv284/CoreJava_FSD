package com.sim.demo2;
class SuperClass{
	void msg(int x, int y) 
	  { 
	    System.out.println("Hello Java"); 
	  } 
	void method1() {
		System.out.println(" Parent class");
	}
}

class SubClass extends SuperClass{
	void msg(double x , double y) {
		System.out.println(" Welcome in overloading java ");
	}
	void method1() {
		System.out.println("child class");
	}
}
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SubClass s1 = new SubClass();
       
       s1.msg(12, 25);
       s1.msg(2.5, 3.2);
       s1.method1();
	}

}
