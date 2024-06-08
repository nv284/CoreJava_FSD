package com.sim.set;

import java.util.TreeSet;

public class TreesetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet<String> t = new TreeSet<String>();
      t.add("Nitin");t.add("Saurabh");t.add("Rahul");t.add("Sachin");t.add("test");t.add("Anil");
      
      t.add("Saurabh");
      
      System.out.println(t);
      t.remove("test");
      System.out.println("After removing element :"+ t);
      System.out.println("Sachin is in the class ? "+t.contains("Sachin"));
      System.out.println(" Is this collection empty ?"+t.isEmpty());
	}

}
