package com.keith.abstractclasses;

public class Camera extends Machine {

	@Override
	public void start() {
		System.out.println("Starting camera.");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Do camera stuff.");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Shutting down camera.");
		
	}

}
