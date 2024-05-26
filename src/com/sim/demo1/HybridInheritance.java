package com.sim.demo1;

//base class 1
class Ability {
	public void show() {
		System.out.println("I am a person, I can speak and run !!");
	}
}

//child interface 1
interface Moveable {
	public void run();
}

//child interface2
interface Speakable {
	public void speak();
}

//child class inheriting two base interfaces
class Person1 extends Ability implements Moveable, Speakable {
	@Override
	public void run() {
		System.out.println("I can run !!");
	}

	@Override
	public void speak() {
		System.out.println("I can speak !!");
	}
}

public class HybridInheritance {
	public static void main(String[] args) {
		Person1 obj = new Person1();
		obj.run();
		obj.speak();
		obj.show();
	}
}
