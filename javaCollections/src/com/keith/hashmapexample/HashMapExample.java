package com.keith.hashmapexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>(); 

		// insert into the map 0(1) IF THERE IS NO COLLISION
		map.put(1, "Adam");
		map.put(2, "Kevin");
		map.put(3, "Ana");
		map.put(40, "Lucy");
		
		// remove items in 0(1)
		map.remove(60);
		
		// we can retrieve items based on keys 0(1)
		// NULL keys
		// System.out.println(map.get(null));
		
		for(Map.Entry<Integer,String> entry : map.entrySet())
			System.out.println(entry.getKey() + " - " + entry.getValue());
	}

}
