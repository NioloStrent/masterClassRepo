package com.keith.immutableclasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html

public class Main {
	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	public static void main(String[] args) {
		// Change the program to allow players to type full words or phrases, then move to the 
		// correct location based upon their input.
		// The player should be able to type commands such as "Go West", "run South", or just "East"
		// and the program will move to the appropriate location if there is one. As at present, an
		// attempt to move in an invalid direction should print a message and remain in the same place.
		//
		// Single letter commands (N, W, S, E, Q) should still be available.
		
		// valid directions translator
		Map<String, String> validDirectionMap = new HashMap<String, String>();
		validDirectionMap.put("Q", "Q");
		validDirectionMap.put("QUIT", "Q");
		validDirectionMap.put("N", "N");
		validDirectionMap.put("NORTH", "N");
		validDirectionMap.put("S", "S");
		validDirectionMap.put("SOUTH", "S");
		validDirectionMap.put("W", "W");
		validDirectionMap.put("WEST", "W");
		validDirectionMap.put("E", "E");
		validDirectionMap.put("EAST", "E");
		
		Scanner scanner = new Scanner(System.in);

		locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
		locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building."));
		locations.put(2, new Location(2, "You are at the top of a hill."));
		locations.put(3, new Location(3, "You are inside a building, a well house for a small spring."));
		locations.put(4, new Location(4, "You are in a valley beside a stream."));
		locations.put(5, new Location(5, "You are in the forest."));

		locations.get(1).addExit("W", 2);
		locations.get(1).addExit("E", 3);
		locations.get(1).addExit("S", 4);
		locations.get(1).addExit("N", 5);

		locations.get(2).addExit("N", 5);

		locations.get(3).addExit("W", 1);

		locations.get(4).addExit("N", 1);
		locations.get(4).addExit("W", 2);

		locations.get(5).addExit("S", 1);
		locations.get(5).addExit("W", 2);

		int loc = 1;
		while (true) {
			System.out.println(locations.get(loc).getDescription());
			if (loc == 0) {
				break;
			}

			Map<String, Integer> exits = locations.get(loc).getExits();
			System.out.print("Available exits are ");
			for (String exit : exits.keySet()) {
				System.out.print(exit + ", ");
			}
			System.out.println();

			//String direction = scanner.nextLine().toUpperCase();
			String input = scanner.nextLine().toUpperCase();
			
			// get the individual parts of the line
			String[] inputArray = input.split(" ");
			
			boolean found=false;
			for ( int i=0; i<inputArray.length; i++ )
			{
				String curInput = inputArray[i];
				
				//is direction valid
				String direction = validDirectionMap.get( curInput );
				if ( direction != null )
				{
					// is direction legal
					if (exits.containsKey(direction)) 
					{
						loc = exits.get(direction);
						found = true;
						break;
					}
					
				}
			}
			
			if ( found == false )
			{
				System.out.println("You cannot go in that direction");
			}

			/*
			if (exits.containsKey(direction)) {
				loc = exits.get(direction);
			} else {
				System.out.println("You cannot go in that direction");
			}
			*/
		}
		
		
	}
}