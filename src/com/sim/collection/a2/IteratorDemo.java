package com.sim.collection.a2;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> flowers = new ArrayList<String>();
     flowers.add("Rose");
     flowers.add("Jasmine");
     flowers.add("Sunflowers");
     
     Iterator<String> flowerRef = flowers.iterator();
     System.out.println("contents of arraylist : " );
     while(flowerRef.hasNext()) {
    	 System.out.println(flowerRef.next());
     }
	}

}
// Newxt , hasnext , remove , voidforEachRemaining