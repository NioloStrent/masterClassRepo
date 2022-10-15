package com.keith.codingexercises;

public class Sum3And5Challenge {

	public static void main(String[] args) {

		int sumCount = 0;
		int aggregateSum = 0;

		for (int i = 1; i <= 1000; i++) {
			if (isDivisibleByThreeAndFive(i) == true) {
				sumCount++;
				aggregateSum += i;
				System.out.println("Number " + i + " is divisible by 3 and 5.");
			}
			if (sumCount == 5) {
				System.out.println("Exiting loop");
				break;
			}
		}
		
		System.out.println("sumCount: " + sumCount);
		System.out.println("aggregateSum: " + aggregateSum);

	}

	public static boolean isDivisibleByThreeAndFive(int n) {
		if ((n % 5) != 0) {
			return false;
		}

		if ((n % 3) != 0) {
			return false;
		}

		return true;
	}

}
