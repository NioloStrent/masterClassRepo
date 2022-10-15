package com.keith.codingexercises;

public class MethodOverloadChallenge {

	public static void main(String[] args) 
	{
		System.out.println( convertToCentimeters(1, 0) );
		System.out.println( convertToCentimeters(0,1) );
		
		System.out.println( convertToCentimeters(1) );



	}

	
	public static double convertToCentimeters(double feet, double inches) {

		// convert feet to inches
		double curInches = (feet * 12) + inches;
		
		// convert inches to cm
		return( convertToCentimeters(curInches) );
		
	}

	public static double convertToCentimeters(double inches) {
		
		// convert inches to cm
		return( inches * 2.54 );
	}
}
