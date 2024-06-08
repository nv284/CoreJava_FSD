package com.sim.queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String[] args)
	{	
	// Create a Queue. This priority queue stores Strings objects.  
	   PriorityQueue<String> pq = new PriorityQueue<>();
	   
	// Adds elements to the priority queue.
	   pq.offer("USA");
	   pq.offer("India");
	   pq.offer("England");
	   pq.offer("Germany");
	   pq.offer("Australia");
	   System.out.println("Priority queue: " +pq);

	// Iterating elements of priority queue.
	   System.out.println("Iterating elements of priority queue");
	   Iterator<String> iterator = pq.iterator();
	   while (iterator.hasNext()) {
	       System.out.print(iterator.next() + " ");
	   }
	   while (pq.peek() != null) 
	   {
	      System.out.println("Head Element: " + pq.peek());
	      System.out.println("Removed Element from Queue: " +pq.remove());
	      System.out.println("Priority queue: " + pq);
	   }
	   
	                                                      //collections is the utility class 
	   PriorityQueue<Integer> pq2 = new PriorityQueue<>(5, Collections.reverseOrder());
	    pq2.offer(50);
	    pq2.offer(100);
	    pq2.offer(60);
	    pq2.offer(20);
	    pq2.offer(10);
	  
	    int size = pq2.size();
	    System.out.println("\nSize of priority queue: " +size);
	    System.out.println("\nPriority queue using Comparator:"); 
	    while(size > 0) {
	        System.out.print(pq2.remove() + " ");
	   }
	 }
}
