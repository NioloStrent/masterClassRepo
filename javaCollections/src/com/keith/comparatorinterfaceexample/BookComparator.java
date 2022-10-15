package com.keith.comparatorinterfaceexample;

import java.util.Comparator;

import com.keith.comparableinterfaceexample.Book;

public class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		return b1.getAuthorName().compareTo(b2.getAuthorName());
	}

}
