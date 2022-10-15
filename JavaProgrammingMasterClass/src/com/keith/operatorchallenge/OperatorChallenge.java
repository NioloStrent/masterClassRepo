package com.keith.operatorchallenge;

public class OperatorChallenge {

	public static void main(String[] args) {
		
		double myFirstDouble = 20.00d;
		double mySecondDouble = 80.00d;
		
		double result = (myFirstDouble + mySecondDouble) * 100.00;
		
		double remainder = result % 40.00d;
		
		boolean remainderBool;
		
		if (remainder == 0) {
			remainderBool = true;
		} else {
			remainderBool = false;
			System.out.println("Got some remainder");
		}
		
		System.out.println(remainderBool);
		
		

	}

}
