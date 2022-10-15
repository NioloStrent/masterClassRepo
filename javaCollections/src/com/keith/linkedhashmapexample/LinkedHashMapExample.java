package com.keith.linkedhashmapexample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		// there is a doubly linked list connecting the inserted items
		Map<String, Integer> map = new LinkedHashMap<>();

		map.put("aaa", 1);
		map.put("bbb", 2);
		map.put("ccc", 3);
		map.put("ddd", 4);
		map.put("eee", 5);
		map.put("fff", 6);
		map.put("ggg", 7);
		map.put("hhh", 8);
		map.put("iii", 9);
		map.put("jjj", 10);

		for (String key : map.keySet())
			System.out.println(key + " - " + map.get(key));
	}

}
