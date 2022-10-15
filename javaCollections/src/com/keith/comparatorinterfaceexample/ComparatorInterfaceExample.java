package com.keith.comparatorinterfaceexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.keith.comparableinterfaceexample.Book;

public class ComparatorInterfaceExample {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Albert Camus","title1", 223));
		books.add(new Book("Z","title3", 33));
		books.add(new Book("Heidegger","Being And Time", 891));
		books.add(new Book("Michio Kaku","Quantum Physics", 34));

		Collections.sort(books, new BookComparator().reversed());
		
		System.out.println(books);
	}

}
