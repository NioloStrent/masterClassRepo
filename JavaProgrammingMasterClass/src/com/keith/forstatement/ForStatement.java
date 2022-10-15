package com.keith.forstatement;

public class ForStatement {

	public static void main(String[] args) {

		/*
		 * Using the for statement, call the calculateInterest method with the amount of
		 * 10000 with an interest rate of 2, 3, 4, 5, 6, 7, and 8 and print the results for the console window.
		 */

		for (int i = 2; i <= 8; i++) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
		}

		System.out.println("---------");

		/*
		 * How would you modify the for loop above to do the same thing as shown but to start from 8% and work back to 2%?
		 */

		for (int i = 8; i >= 2; i--) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
		}
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

}
