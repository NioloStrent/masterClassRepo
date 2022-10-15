package com.keith.inheritancechallenge;

public class Main {

	public static void main(String[] args) {
		
		// Challenge:
		// Start with a base class of a Vehicle, then create a car class that inherits from this base class.
		// Finally, create another class, a specific type of Car that inherits from the Car class.
		// You should be able to handle steering, changing gears, and moving (speed in other words).
		// You will want to decide where to put the appropriate state and behaviours (fields and methods).
		// As mentioned above, changing gears, increasing/decreasing speed should be included.
		// For your specific type of vehicle, you will want to add something specific for that type of car.

		Vehicle vehicle = new Vehicle("left", 3, 20);
		System.out.println("The vehicle is turning to the " + vehicle.getSteeringDirection() + ".");
		System.out.println("The vehicle is currently at " + vehicle.getCurrentGear() + " gear.");
		System.out.println("The vehicle is moving at " + vehicle.getMoveSpeed() + " mph.");
		
		System.out.println("----------------------");
		
		Car car = new Car("right", 2, 80);
		System.out.println("The car is turning to the " + car.getSteeringDirection() + ".");
		System.out.println("The car is currently at " + car.getCurrentGear() + " gear.");
		System.out.println("The car is moving at " + car.getMoveSpeed() + " mph.");
		
		System.out.println("----------------------");
		
		Truck truck = new Truck("left", 5, 50, 2);
		System.out.println("The truck is turning to the " + truck.getSteeringDirection() + ".");
		System.out.println("The truck is currently at " + truck.getCurrentGear() + " gear.");
		System.out.println("The truck is moving at " + truck.getMoveSpeed() + " mph");
		System.out.println("The truck has " + truck.getNumberOfRearViewMirrors() + " rearview mirrors.");
	}

}
