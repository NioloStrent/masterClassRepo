package com.keith.compositionchallenge;

public class Main {

	public static void main(String[] args) {
		
		// Create a single room of a house using composition.
		// Think about the things that should be included in a room.
		// Maybe physical parts of the house but furniture as well.
		// Add at least one method to access an object via a getter and
		// then that object's public method as you saw in the previous video
		// then add at least one method to hide the object e.g. not using a getter
		// but to access the object used in composition within the main class
		// like you saw in this video.
		
		
		Desk desk = new Desk(5, "beige", 3);
		Lamp lamp = new Lamp(true, "LED", 15);
		Shelf shelf = new Shelf(10, "brown", 40);
		Book book = new Book("Pride and Prejudice", 300, true, "978-0-547-25025-0");
		Room room = new Room(desk, lamp, shelf, book);
		
		System.out.println(room.toString());
		
		room.leaveRoom();
		
		System.out.println(room.toString());
		
	}

}
