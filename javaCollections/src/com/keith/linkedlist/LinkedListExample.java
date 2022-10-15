package com.keith.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		// 0(1)
		list.addFirst(1);
		list.addFirst(10);
		list.addFirst(5);
		list.addFirst(3);
		
		list.removeLast();
		
		System.out.println("isEmpty(): " + list.isEmpty());
		
		for(Integer num : list)
			System.out.println(num);
		
	}

}
