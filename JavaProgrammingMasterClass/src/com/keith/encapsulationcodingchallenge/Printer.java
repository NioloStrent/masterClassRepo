package com.keith.encapsulationcodingchallenge;

public class Printer {
	private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
	public Printer(int tonerLevel, boolean duplex) {
		
		System.out.println( "constructor start tonerLevel:" + tonerLevel);
		addToner(tonerLevel);
		this.pagesPrinted = 0;
		
		this.duplex = duplex;
		
		System.out.println( "constructor end tonerLevel:" + tonerLevel);
	}

	public int addToner(int tonerAmount) {
		
		System.out.println( "addToner start tonerLevel:" + tonerLevel);

		// if (tonerAmount > 0 && tonerAmount <= 100 && tonerLevel + tonerAmount > 100) {
		if (tonerAmount < 0 || tonerAmount > 100 || ( (tonerLevel + tonerAmount) > 100)) {
			tonerLevel = -1;
		} else {
			if(tonerLevel == -1) {
				tonerLevel = 0;
			}
			tonerLevel += tonerAmount;
		}
		
		System.out.println( "addToner end tonerLevel:" + tonerLevel);

		return tonerLevel;
	}
	
	public int printPages(int pages) {
		int pagesToPrint = pages;
		if(duplex == true) {
			System.out.println("Printing in duplex mode.");
			pagesToPrint /= 2;
			pagesPrinted += pagesToPrint;
		}
		return pagesToPrint;
	}
	
	public int getPagesPrinted() {
		return pagesPrinted;
	}
}
