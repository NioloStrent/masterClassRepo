package com.keith.abstractclasses;

public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Starting car.");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Do car stuff.");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Shutting down camera.");
		
	}

}
