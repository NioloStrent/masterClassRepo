package com.keith.arraydequeexample;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		
		// double ended queue (DEQUE)
		// huge one dimensional arrays - 0(1)
		
		// FIFO - First In First Out
		/*
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.offer(1);
		queue.offer(10);
		queue.offer(100);
		queue.offer(1000);
		
		while(!queue.isEmpty())
			System.out.println(queue.poll());
		*/
		
		Deque<Integer> stack = new ArrayDeque<>();
		
		// LIFO - Last In First Out
		stack.push(1);
		stack.push(10);
		stack.push(100);
		stack.push(1000);
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}

}
