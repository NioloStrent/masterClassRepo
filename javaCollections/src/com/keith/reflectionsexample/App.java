package com.keith.reflectionsexample;

public class App {

	public static void main(String[] args) {
		
		// first method to acquire the class
		Class<Person> c = Person.class;
		System.out.println(c.getName());

		// second approach
		Class personClass = null;
		
		try {
			personClass = Class.forName("com.keith.reflectionsexample.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(personClass.getName());
		
		checkClass(new Car());
	}
	
	public static void checkClass(Vehicle vehicle) {
		Class c = vehicle.getClass();
		System.out.println(c.getName());
	}

}
