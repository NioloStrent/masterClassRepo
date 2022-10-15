package com.keith.sortedmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(treeMap);
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(3, "cat");
		map.put(18, "dog");
		map.put(6, "giraffe");
		map.put(9, "swan");
		map.put(13, "bear");
		map.put(27, "snake");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}

}
