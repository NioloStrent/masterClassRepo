package com.keith.listexample;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("Adam");
		names.add("Susan");
		names.add("Bobby");
		
		for(String name : names) {
			System.out.println(name);
		}

	}

}
