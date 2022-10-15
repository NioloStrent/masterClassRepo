package com.keith.encapsulationchallenge;

public class Main {
	
	// Create a class and demonstrate proper encapsulation techniques.
	// the class will be called Printer.
	// It will simulate a real Computer Printer.
	// It should have fields for the toner level, number of pages printed, and
	// also whether its a duplex printer (capable of printing on both sides of the paper).
	// Add methods to fill up the toner (up to a maximum of 100%), another method to
	// simulate printing a page (which should increase the number of pages printed).
	// Decide on the scope, whether to use constructors, and anything else you think is needed.

	public static void main(String[] args) {
		Printer printer = new Printer(0, 0, true);
		
		System.out.println("Current toner level is at: " + printer.getTonerLevel());
		
		printer.addToner(101);
		
		System.out.println("Updated toner level is at: " + printer.getTonerLevel());
		
		System.out.println("Amount of pages printed: " + printer.getNumberOfPagesPrinted());
		
		printer.printPage(1);
		
		System.out.println("Updated amount of pages printed: " + printer.getNumberOfPagesPrinted());
		
		printer.printPage(10);
		
		System.out.println("Updated amount of pages printed: " + printer.getNumberOfPagesPrinted());
		
		System.out.println("Is printer a duplex printer?: " + printer.isDuplexPrinter());
	}

}
