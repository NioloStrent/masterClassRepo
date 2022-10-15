package com.keith.encapsulationchallenge;

public class Printer {

	private int tonerLevel;
	private int numberOfPagesPrinted;
	private boolean duplexPrinter;
	
	public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplexPrinter) {
		this.tonerLevel = tonerLevel;
		this.numberOfPagesPrinted = numberOfPagesPrinted;
		this.duplexPrinter = duplexPrinter;
	}
	
	public void addToner(int toner) {
		if (toner <= 100 && tonerLevel != 100) {
			tonerLevel += toner;
			System.out.println("Added " + toner + " toner to printer.");
		} else {
			System.out.println("Toner is full.");
			this.tonerLevel = 100;
		}
	}
	
	public void printPage(int page) {
		if (page == 1) {
			numberOfPagesPrinted += page;
			System.out.println("Printing " + page + " page.");
		} else {
			numberOfPagesPrinted += page;
			System.out.println("Printing " + page + " pages.");
		}
		
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getNumberOfPagesPrinted() {
		return numberOfPagesPrinted;
	}

	public boolean isDuplexPrinter() {
		return duplexPrinter;
	}
	
}
