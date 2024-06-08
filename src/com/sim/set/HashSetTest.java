package com.sim.set;

import java.util.HashSet;

class Student{
	int rollno;	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}	
}


public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(10, "Ram");
		Student s2 = new Student(20, "Shyam");
		Student s3 = new Student(30, "Radha");
		Student s4 = new Student(40, "Meera");
		
		HashSet<Student> st = new HashSet<Student>();
		
		st.add(s1);st.add(s2);st.add(s3);st.add(s4);
		
		for(Student s : st) {
			System.out.println(s.rollno+"   "+s.name);
		}
        st.remove(s4);
        for(Student s : st) {
			System.out.println(s.rollno+"   "+s.name);
		}
        
	}

}
