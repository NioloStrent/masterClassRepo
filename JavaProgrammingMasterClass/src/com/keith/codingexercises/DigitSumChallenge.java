package com.keith.codingexercises;

public class DigitSumChallenge {

	public static void main(String[] args) {
		System.out.println(sumDigits(125));
	}
	
	private static int sumDigits (int number) {
		
		int sum = 0;
		
		if (number >= 10) {
			String val = ((Integer) number).toString();
			System.out.println("Value: " + val);
			for(int i = 0; i<val.length(); i++) {
				String currentValue = val.substring(i, i+1);
				sum += Integer.parseInt(currentValue);
			}
			return sum;
		} else {
			System.out.println("Invalid number");
			return -1;
		}
	}

}
