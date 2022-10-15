package com.keith.comparableinterfaceexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceExample {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Albert Camus","title1", 223));
		books.add(new Book("Z","title3", 33));
		books.add(new Book("Heidegger","Being And Time", 891));
		books.add(new Book("Michio Kaku","Quantum Physics", 34));
		
		Collections.sort(books);
		
		System.out.println(books);
		
		/*
		List<String> characters = new LinkedList<>();
		
		characters.add("v");
		characters.add("a");
		characters.add("c");
		characters.add("t");
		characters.add("w");
		
		Collections.sort(characters);
		
		System.out.println(characters);
		
		int[] nums = {1,5,3,8,10,-2,0};
		String[] names = {"Adam", "Joe", "Ana", "Kevin", "Steven"};
		
		// quicksort --> sorting primitive types
		// mergesort --> reference types
		
		Arrays.sort(names);
		
		for (String n : names)
			System.out.print(n + " - ");
		 */
	}

}
