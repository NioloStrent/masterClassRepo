package com.keith.inheritance;

public class Car extends Machine {
	
	@Override
	public void start() {
		System.out.println("Car started.");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped.");
	}
	
	
	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}

	
}
