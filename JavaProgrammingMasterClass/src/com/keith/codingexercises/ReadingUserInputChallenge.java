package com.keith.codingexercises;

import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {

		int sum = 0;
		int counter = 1;

		Scanner scanner = new Scanner(System.in);

		while (counter <= 10) {
			System.out.println("Enter number #" + counter + ": ");
			// int num = scanner.nextInt();
			int num = 0;
			boolean res = scanner.hasNextInt();
			if (res == true) {
				num = scanner.nextInt();
				counter++;
				sum += num;
			} else {
				System.out.println("Invalid Number");
				scanner.next();
			}
			
		}

		System.out.println("The sum of your entered values is: " + sum);

		scanner.close();
	}
}
