package com.sim.demo1;

//Base class
class Person {
	public void show() {
		System.out.println("I am a Person");
	}
}

//child class1
class Student extends Person {
	public void show1() {
		System.out.println("I am a Student who is Person ");
	}
}

//child class2
class Teacher extends Person {
// defining additional properties to the child class
	public void show2() {
		System.out.println("I am a Teacher who is a Person");
	}
}

//child class3
class Doctor extends Person {
// defining additional properties to the child class
	public void show3() {
		System.out.println("I am a Doctor who is a Person");
	}
}

public class HierarchicalInheritance {
	public static void main(String args[]) {
		Teacher teacher = new Teacher();
		Student student = new Student();
		Doctor doctor = new Doctor();
		student.show();
		student.show1();
		teacher.show2();
		doctor.show3();
	}
}
