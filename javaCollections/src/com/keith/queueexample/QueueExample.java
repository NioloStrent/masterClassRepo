package com.keith.queueexample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();

		// FIFO - First In, First Out
		queue.add("Adam");
		queue.add("Kevin");
		queue.add("Ana");
		queue.add("Katy");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
	}

}
