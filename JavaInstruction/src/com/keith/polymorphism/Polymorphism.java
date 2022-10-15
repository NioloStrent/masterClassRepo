package com.keith.polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
		tree.shedLeaves();
		
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
