package com.keith.hashcodeandequalsexample;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEqualsExample {

	public static void main(String[] args) {
		
		Map<String, Person> map = new HashMap<>();

		map.put("Adam", new Person("Kevin", 23));
	}

}
