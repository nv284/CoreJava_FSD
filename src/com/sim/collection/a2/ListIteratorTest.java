package com.sim.collection.a2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		 list.add("Red");
		  list.add("Green");
		  list.add("Yellow"); 
		  list.add("Orange");
		  list.add("Blue");
		  list.add("White");
		  System.out.println("List :"+list);
		  ListIterator<String> it = list.listIterator();
		  System.out.println();
		  System.out.println("List Iterator in Forward Direction:");
		  while(it.hasNext()) {
			  int idx = it.nextIndex();
			  String ele = it.next();
			  System.out.println(" Index = "+idx +"   Element : "+ele);
		  }
		  it.add("Sky Blue");
		  System.out.println("List after adding :"+list);
	
		  System.out.println();
		   System.out.println("List Iterator in Backward Direction:");
		   while(it.hasPrevious()) {
				  int idx = it.previousIndex();
				  String ele = it.previous();
				  System.out.println(" Index = "+idx +"   Element : "+ele);
			  }
		   it.set("Hot Red");
		   System.out.println("List after setting :"+list);
	}

}
