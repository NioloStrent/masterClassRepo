package com.keith.inheritancechallenge;

public class Vehicle {

	private String steeringDirection;
	private int currentGear;
	private int moveSpeed;

	public Vehicle(String steeringDirection, int currentGear, int moveSpeed) {
		this.steeringDirection = steeringDirection;
		this.currentGear = currentGear;
		this.moveSpeed = moveSpeed;
	}

	public void move(int moveSpeed) {
		System.out.println("Vehicle is moving at: " + moveSpeed + " mph.");
	}
	
	public void changeGear(int currentGear) {
		System.out.println("Shifting to " + currentGear + " gear.");
	}
	
	public String getSteeringDirection() {
		if (steeringDirection == "left" || steeringDirection == "right") {
			return steeringDirection;
		} else {
			return "ERROR";
		}
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public int getMoveSpeed() {
		return moveSpeed;
	}
}
