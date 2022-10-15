package com.keith.compositionchallenge;

public class Book {

	private String name;
	private int pageCount;
	private boolean hasDustJacket;
	private String isbn;
	
	public Book(String name, int pageCount, boolean hasDustJacket, String isbn) {
		this.name = name;
		this.pageCount = pageCount;
		this.hasDustJacket = hasDustJacket;
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public int getPageCount() {
		return pageCount;
	}

	public boolean isHasDustJacket() {
		return hasDustJacket;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Harddrive [name=" + name + ", pageCount=" + pageCount + ", hasDustJacket=" + hasDustJacket + ", isbn=" + isbn
				+ "]";
	}
	
}
