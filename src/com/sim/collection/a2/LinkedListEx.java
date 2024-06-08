package com.sim.collection.a2;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> city = new LinkedList<String>();
        
        city.add("New York");
        city.add("Boston");
        city.add("Sydney");
        city.add("London");
        
        System.out.println(" Citis :"+ city);
        System.out.println(" city name :"+city.get(1));
      //  System.out.println(" Add new city : "+ city.set(4, "Kingslaglay"));
        System.out.println(" New citis "+city);
        
        
        
        
        LinkedList list = new LinkedList(); 
        list.add("One"); 
        list.add(2); 
        list.add(null);
        list.add("Four"); 
        System.out.println("Initial LinkedList order: " +list); //one , 2 , null ,four
        list.add(3, "Three"); 
        System.out.println("LinkedList Elements after adding the first element"); //one ,2 ,Three , null , four 
        list.addFirst("Zero"); 
        System.out.println(list); 
     // Adding all elements from existing ArrayList collection to the end of the LinkedList. 
        ArrayList al = new ArrayList(); 
        al.add("Six"); 
        al.add(7); 
        al.add("Eight");
        
        list.addAll(al);
        System.out.println("LinkedList Elements after adding all elements from ArrayList"); 
        System.out.println(list); 
        System.out.println(" Size of the list :"+list.size());
        list.removeFirst();
        System.out.println("After removing :"+list); 
        
        
        LinkedList<Integer> list1 = new LinkedList<Integer>(); 
        for(int i =0;i<=20 ; i++) {
        	if(i % 2==0)
        		list1.add(i);
        	
        }
        Object firstEvenNumber = list.getFirst();
        System.out.println("First even no :"+firstEvenNumber);
        
        	
        }
        
	}


