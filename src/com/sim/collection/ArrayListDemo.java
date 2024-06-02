package com.sim.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Laptop");
		a1.add("Charger");
		a1.add("Mobile");
		a1.add("Ipad");
		a1.add("Ipad");
		a1.add("Ipad");
		a1.add(null);
		a1.add(3, null);
		System.out.println(" Products "+ a1);
		a1.remove(3);
		System.out.println("after removing  Products "+ a1);
		System.out.println(" Products list size "+ a1.size());
		System.out.println("  is this Products available "+ a1.contains("laptop"));
		System.out.println(" last index "+ a1.lastIndexOf("Ipad"));
		
		
	}

}
