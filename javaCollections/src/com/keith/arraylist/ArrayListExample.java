package com.keith.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// Resizing the array takes 0(N)
		List<String> names = new ArrayList<>();

		names.add("Kevin");
		names.add("Adam");
		names.add("Ana");
		
		// random indexing in 0(1)
		// System.out.println(names.get(0));
		
		// insert item into a given index - 0(N)
		names.add(0, "Daniel");
		names.remove(0);
		
		Object[] o = names.toArray();
		
		// ARRAYLIST (ARRAYS) ARE FAST IF WE MANIPULATE THE LAST ITEM
		
		// Because of the Iterable interface
		for(Object s : o)
			System.out.println(s);
	}

}
