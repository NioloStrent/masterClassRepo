package com.keith.publicprivateprotected;

public class Oak extends Plant {
	
	public Oak() {
		
		// Won't work -- type is private
		// type = "tree";
		
		// This works --- size is protected, Oak is a subclass
		this.size = "large";
	}
}
