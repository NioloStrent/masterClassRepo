package com.keith.publicprivateprotected;

public class App {

	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		// Won't work --- type is private
		// System.out.println(plant.type);
	}

}
