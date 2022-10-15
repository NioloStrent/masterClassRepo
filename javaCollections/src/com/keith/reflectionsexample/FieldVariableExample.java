package com.keith.reflectionsexample;

import java.lang.reflect.Field;

public class FieldVariableExample {

	public static void main(String[] args) {
		
		Class<Person> personClass = Person.class;
		
		Field[] fields = personClass.getFields();
		
		for(Field f : fields)
			System.out.println(f.getName());
	}

}
