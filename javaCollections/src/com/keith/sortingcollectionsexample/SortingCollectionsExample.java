package com.keith.sortingcollectionsexample;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingCollectionsExample {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(5);
		list.add(2);
		list.add(20);
		
		// we can specify reverse order
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list);

	}

}
