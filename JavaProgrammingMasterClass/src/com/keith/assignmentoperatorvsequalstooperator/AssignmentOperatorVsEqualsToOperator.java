package com.keith.assignmentoperatorvsequalstooperator;

public class AssignmentOperatorVsEqualsToOperator {

	public static void main(String[] args) {
		
		int newValue = 50;
		// if (newValue = 50) { // Incorrectly uses the assignment operator '=' to assign the value 50 to newValue
		if (newValue == 50) { // Correctly uses the equal to operator '=='
			System.out.println("This is an error");
		}
		
		boolean isCar = false;
		if (isCar == false) {
			System.out.println("This is not supposed to happen");
		}

	}

}
