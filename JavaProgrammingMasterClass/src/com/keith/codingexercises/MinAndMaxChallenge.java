package com.keith.codingexercises;

import java.util.Scanner;

public class MinAndMaxChallenge {

	public static void main(String[] args) {
		
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;

		Scanner scanner = new Scanner(System.in);

		while (true == true) {
			System.out.println("Enter number: ");
			int num = 0;
			boolean res = scanner.hasNextInt();
			if (res == true) {
				num = scanner.nextInt();
				if (num < minValue) {
					minValue = num;
				}
				
				if (num > maxValue) {
					maxValue = num;
				}
			} else {
				System.out.println("Minimum value: " + minValue);
				System.out.println("Maximum value: " + maxValue);
				break;
			}

		}

		scanner.close();
	}

}
