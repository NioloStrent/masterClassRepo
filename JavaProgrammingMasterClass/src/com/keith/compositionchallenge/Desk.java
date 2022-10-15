package com.keith.compositionchallenge;

public class Desk {

	private int size;
	private String color;
	private int deskObjectCount;
	
	public Desk(int size, String color, int deskObjectCount) {
		this.size = size;
		this.color = color;
		this.deskObjectCount = deskObjectCount;
	}

	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public int getDeskObjectCount() {
		return deskObjectCount;
	}

	@Override
	public String toString() {
		return "Desk [size=" + size + ", color=" + color + ", deskObjectCount=" + deskObjectCount + "]";
	}
	
}
