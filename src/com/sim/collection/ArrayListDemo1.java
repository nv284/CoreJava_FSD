package com.sim.collection;

import java.util.ArrayList;

class Student{
	String name ; int id ; int rollno;

	public Student(String name, int id, int rollno) {
		super();
		this.name = name;
		this.id = id;
		this.rollno = rollno;
	}}


public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>  a1 = new ArrayList<Student>();
		
		Student s1 = new Student("Deepa", 1234, 44);
		Student s2 = new Student("Manoj", 1555, 34);
		Student s3 = new Student("Yogesh", 1444	, 94);
		Student s4 = new Student("Riddhi", 1212, 02); 
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		
		for(Student st : a1 ) {
			System.out.println("Student's name: " +st.name); 
			System.out.println("Student ID " +st.id); 
			System.out.println("Roll number: " +st.rollno); 
		}

	}

}
