package com.keith.whileanddowhilestatements;

public class WhileAndDoWhileStatements {

	public static void main(String[] args) {
		
		// int count = 6;
//		while(count != 6) {
//			System.out.println("Count value is: " + count);
//			count++;
//		}
//		
//		for(int i=6; i!=6; i++) {
//			System.out.println("Count value is: " + count);
//		}
		
		
		// Create a method called isEvenNumber that takes a parameter of type int
		// Its purpose is to determine if the argument passed to the method is an even number or not.
		// return true if an even number, otherwise return false;
		
		int number = 4;
		int finishNumber = 20;
		int totalEvenNumbers = 0;
		
		while (number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}
			
			System.out.println("Even number: " + number);
			
			totalEvenNumbers++;
			
			if (totalEvenNumbers == 5) {
				break;
			}
		}
		
		System.out.println("Total even numbers found: " + totalEvenNumbers);

	}
	
	// Create a method called isEvenNumber that takes a parameter of type int
	// Its purpose is to determine if the argument passed to the method is
	// an even number or not. 
	// return true if an even number, otherwise return false
	
	public static boolean isEvenNumber(int num) {
		
		if((num % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

}
