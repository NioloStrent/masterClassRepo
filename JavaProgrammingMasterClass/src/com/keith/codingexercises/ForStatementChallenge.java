package com.keith.codingexercises;

public class ForStatementChallenge {

	/*
	 * Create a for statement using any range of numbers 
	 * Determine if the number is a prime number using the isPrime method 
	 * If it is a prime number, print it out and increment a count of the number of prime numbers found 
	 * if that count is three exit the for loop hint: Use the 'break;' statement to exit
	 */
	
	public static void main(String[] args) {
		
		int primeCount = 0;

		for (int i = 10; i < 50; i++) {
			if (isPrime(i) == true) {
				primeCount++;
				System.out.println("Number " + i + " is a prime number.");
			}
			if (primeCount == 3) {
				System.out.println("Exiting loop");
				break;
			}
		}

	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
