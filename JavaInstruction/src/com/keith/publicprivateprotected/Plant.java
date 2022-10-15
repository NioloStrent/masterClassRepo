package com.keith.publicprivateprotected;

public class Plant {
	// Bad practice
	public String name;
	
	// Acceptable practice so long as final is used.
	public final static int ID = 8;
	
	private String type;
	
	protected String size;
	
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		this.size = "medium";
	}
}
