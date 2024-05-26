package com.sim.demo2;


class A{
	private int foo ;
	
	public A(int foo) {
		super();
		this.foo = foo;
	}

	public int getFoo() {
		return this.foo;
	}
}

class B extends A {
	int x ;
	
	public B(int foo, int x) {
		super(foo);
		this.x = x;
	}

	public void doSomething() {
		getFoo();
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B b1 = new B(20,20);
     b1.doSomething();
	}

}
