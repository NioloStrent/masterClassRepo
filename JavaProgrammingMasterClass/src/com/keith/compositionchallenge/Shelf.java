package com.keith.compositionchallenge;

public class Shelf {

	private int size;
	private String color;
	private int bookCount;
	
	public Shelf(int size, String color, int bookCount) {
		this.size = size;
		this.color = color;
		this.bookCount = bookCount;
	}

	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public int getBookCount() {
		return bookCount;
	}

	@Override
	public String toString() {
		return "Shelf [size=" + size + ", color=" + color + ", bookCount=" + bookCount + "]";
	}
	
}
