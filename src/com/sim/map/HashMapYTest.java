package com.sim.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapYTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap<Integer, String> map = new HashMap<Integer, String>();
   
   System.out.println(" Is Map Empty ? "+map.isEmpty());
   
   map.put(101, "Red");
   map.put(103, "Blue");map.put(102, "Yellow");map.put(104, "Blue");map.put(106, "Pink");
   
   System.out.println(" What is the size of hashmap ? "+map.size());
   System.out.println("entries in map : "+map);
   
   map.remove(104);
   
   System.out.println("entries in map : "+map);
   
   System.out.println(" Replace Red : "+map.replace(101, "Hot Red"));
   System.out.println("entries in map after replacing : "+map);
   
   Set<Integer> keys = map.keySet();
   System.out.println("set view of keys "+keys);
   
   String value = map.get(101);
   System.out.println(value);
   
	}

}
