package com.keith.tostring;

class Frog {

	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		
		return String.format("%-4d: %s", id, name);
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		
		return sb.toString();
		*/
	}
	
}

public class ToStringExample {

	public static void main(String[] args) {
		Frog frog1 = new Frog(7, "Freddy");
		
		System.out.println(frog1);
		
		
	}

}
