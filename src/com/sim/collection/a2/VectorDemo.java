package com.sim.collection.a2;

import java.util.Vector;

/*
 * int capacityIncreament: Contains the value of the increment.
 * int elementCount: Number of elements that are currently stored in the vector.
 * Object elementData[]: The vector is kept in an array that is stored in it
 * */
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // creating default vector(with capacity equals to 10)
		Vector<Integer> v = new Vector<Integer>();
		
		 Vector<Integer> fixedSizeVector = new Vector<Integer>(100);
		 fixedSizeVector.add(100); fixedSizeVector.add(100); fixedSizeVector.add(100); fixedSizeVector.add(100);
		 
		// creating a vector of given Capacity = 30 and Increment=20
		 Vector< Integer> incrementalVector = new Vector<Integer>(30,20);
		 
		 Vector<Integer> copyConstructorVector = new Vector<Integer>(fixedSizeVector);
		 System.out.println("Vector defaultvector has capacity "+v.capacity());
		 
		 System.out.println("Vector fixedSizeVector has capacity "+fixedSizeVector.capacity());
		 
		 System.out.println("Vector incrementalVector  has capacity "+incrementalVector .capacity());
		 
		 System.out.println("Vector copyConstructorVector  has capacity "+copyConstructorVector.capacity());
		 
		 
		 Vector myVector = new Vector(4, 2);
		 System.out.println("Initial size: " + myVector.size());
		    System.out.println("Initial capacity: " + myVector.capacity()); //4
		    myVector.add("Java");myVector.add("C++");myVector.add("Python");myVector.add("JavaScript");
		    System.out.println("Capacity after four additions: " + myVector.capacity());
		    myVector.add(100); // Addition of one more element will increase the capacity by 2.
		    System.out.println("Capacity after one more additions: " + myVector.capacity());
		    myVector.add(2.0);
		    myVector.add(77);
		    System.out.println("Capacity after two more additions: " + myVector.capacity());
		    System.out.println("Final Vector = " + myVector);
		    
		    for(int i = 0  ; i< myVector.size() ; i++) {
		    	System.out.println(myVector.get(i) +"  ");
		    }
		    

		 

	}

}
