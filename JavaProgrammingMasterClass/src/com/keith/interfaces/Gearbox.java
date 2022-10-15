package com.keith.interfaces;

public class Gearbox {

	private boolean clutchIsIn;
	
	public void operateClutch(boolean inOurOut) {
		this.clutchIsIn = inOurOut;
	}
}
