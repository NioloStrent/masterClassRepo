package com.keith.inheritance;

public class Machine {
	
	String name = "Machine Type 1";
	
	public void start() {
		System.out.println("Machine started.");
	}
	
	public void stop() {
		System.out.println("Machine stopped.");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
}
