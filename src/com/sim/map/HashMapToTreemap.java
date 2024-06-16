package com.sim.map;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapToTreemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(1, "CSS");m1.put(2, "Java");m1.put(null, "PHP");m1.put(8, "Python");m1.put(null, null);*/
		
		HashMap<String, String> hmap = new HashMap<>();
		hmap.put("R", "Red");
		   hmap.put("G", "Green");
		   hmap.put("B", "Brown");
		   hmap.put("O", "Orange");
		   hmap.put("P", "Pink");

		   System.out.println("Entries of HashMap: " +hmap);
		
		System.out.println(" Hashmap "+ hmap.keySet());
		System.out.println("Hashmap Values :"+hmap.values());
		
		TreeMap<String, String> tree = new TreeMap<String, String>(hmap);
		
		System.out.println(" TreeMap keys are : "+ tree.keySet());

	}

}
