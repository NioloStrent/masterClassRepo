package com.keith.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		// HashSet does not retain order.
		// Set<String> set1 = new HashSet<String>();
		
		// LinkedHashSet remembers the order you added items in
		// Set<String> set1 = new LinkedHashSet<String>();
		
		// TreeSet sorts in natural order.
		Set<String> set1 = new TreeSet<String>();
		
		if(set1.isEmpty()) {
			System.out.println("Set is empty at start.");
		}
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		if(set1.isEmpty()) {
			System.out.println("Set is empty after adding.");
		}
		
		// Adding duplicate items does nothing.
		set1.add("mouse");
		
		
		System.out.println(set1);
		
		
		/////////////// Iteration /////////////////
		
		for(String element: set1) {
			System.out.println(element);
		}
		
		//////////////////// Does set contain a given item? /////////////////////////
		
		if(set1.contains("aardvark")) {
			System.out.println("Contains aardvark!");
		}
		
		if(set1.contains("cat")) {
			System.out.println("Contains cat");
		}
		
		// set2 contains some common elements with set1, and some new
		
		Set<String> set2 = new TreeSet<String>();
		
		set2.add("spider");
		set2.add("cat");
		set2.add("beetle");
		set2.add("eagle");
		set2.add("hawk");
		
		/////////////////// Intersection ///////////////////////////
		
		Set<String> intersection = new HashSet<String>(set1);
		
		intersection.retainAll(set2);
		
		System.out.println(intersection);
		
		/////////////////// Difference ///////////////////////////
		
		Set<String> difference = new HashSet<String>(set1);
		
		difference.removeAll(set2);
		System.out.println(difference);
	}

}
