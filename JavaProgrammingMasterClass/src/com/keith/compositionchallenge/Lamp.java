package com.keith.compositionchallenge;

public class Lamp {

	private boolean on;
	private String bulbType;
	private int wattage;
	
	public Lamp(boolean on, String bulbType, int wattage) {
		this.on = on;
		this.bulbType = bulbType;
		this.wattage = wattage;
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public boolean isOn() {
		return on;
	}
	public String getBulbType() {
		return bulbType;
	}
	public int getWattage() {
		return wattage;
	}

	@Override
	public String toString() {
		return "Lamp [on=" + on + ", bulbType=" + bulbType + ", wattage=" + wattage + "]";
	}
	
}
