package com.keith.serialization;

import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = -7409446550125501189L;
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
