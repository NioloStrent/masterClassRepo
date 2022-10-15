package com.keith.accessmodifiers;

interface IAccessible { // package-private 
	int SOME_CONSTANT = 100; // public
	public void methodA(); // public
	void methodB(); // public
	boolean methodC(); // public
}
