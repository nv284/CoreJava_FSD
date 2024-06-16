package com.sim.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer> grocery = new TreeMap<String, Integer>(Comparator.<String>reverseOrder());
		grocery.put("maggie", 2);grocery.put("chololate", 5);
		grocery.put("Salt", 1);
		grocery.put("Biscuit", 4);
		System.out.println("Groceries Item : "+grocery.keySet());
		
		TreeMap<String, Integer> groceryItems =
                new TreeMap<String, Integer>(Comparator.<String>naturalOrder());
		groceryItems.put("Maggie", 2);
        groceryItems.put("Chocolate", 5);
        groceryItems.put("Salt", 1);
        groceryItems.put("Sugar", 3);
        groceryItems.put("Biscuit", 4);
        groceryItems.put("Anjeer", 20);
        System.out.println("First Entry : "+groceryItems.firstEntry());
        System.out.println("Last Entry :"+groceryItems.lastEntry());
        System.out.println("First Key : "+groceryItems.firstKey());
        System.out.println("Last Key : "+groceryItems.lastKey());
        
        System.out.println("Map Content : "+groceryItems.entrySet());
        System.out.println("First 3 Entries "+groceryItems.headMap("Salt").entrySet());
        
	}

}
