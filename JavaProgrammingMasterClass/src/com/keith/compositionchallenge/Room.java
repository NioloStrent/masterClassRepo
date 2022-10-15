package com.keith.compositionchallenge;

public class Room {
	
	private Desk desk;
	private Lamp lamp;
	private Shelf shelf;
	private Book book;
	
	public Room(Desk desk, Lamp lamp, Shelf shelf, Book book) {
		this.desk = desk;
		this.lamp = lamp;
		this.shelf = shelf;
		this.book = book;
	}
	
	public void leaveRoom() {
		System.out.println("TURN OFF THAT LIGHT!");
		lamp.turnOff();
	}

	public Desk getDesk() {
		return desk;
	}

	public void setDesk(Desk desk) {
		this.desk = desk;
	}

	public Lamp getLamp() {
		return lamp;
	}

	public void setLamp(Lamp lamp) {
		this.lamp = lamp;
	}

	public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Room [desk=" + desk + ", lamp=" + lamp + ", shelf=" + shelf + ", book=" + book + "]";
	}
	
}
