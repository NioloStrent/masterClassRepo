package com.keith.inheritancechallenge;

public class Truck extends Car {

	private int numberOfRearViewMirrors;
	
	public Truck(String steeringDirection, int currentGear, int moveSpeed, int numberOfRearViewMirrors) {
		super(steeringDirection, currentGear, moveSpeed);
		this.numberOfRearViewMirrors = numberOfRearViewMirrors;
	}

	public int getNumberOfRearViewMirrors() {
		return numberOfRearViewMirrors;
	}

}
