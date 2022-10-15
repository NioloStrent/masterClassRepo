package com.keith.staticandfinal;

class Thing {
	public final static int LUCKY_NUMBER = 7;
	
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		
		id = count;
		
		count++;
	}
	
	public void showName() {
		System.out.println("Object ID: " + id + ", " + description + ": " + name);
	}
	
	public static void showInfo() {
		System.out.println(description);
		// Won't work: System.out.println("Hello");
	}
}

public class StaticAndFinal {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";
		
		Thing.showInfo();
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating objects, count is: " + Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
	}
}
