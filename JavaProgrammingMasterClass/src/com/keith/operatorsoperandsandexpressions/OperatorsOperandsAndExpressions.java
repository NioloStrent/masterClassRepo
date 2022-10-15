package com.keith.operatorsoperandsandexpressions;

public class OperatorsOperandsAndExpressions {

	public static void main(String[] args) {

		int result = 1 + 2; // 1 + 2 = 3
		
		System.out.println("result: " + result);
		
		int previousResult = result;
		System.out.println("previousResult: " + previousResult);
		
		result = result - 1;
		System.out.println("subtractedResult: " + result);
		
		result = result * 10;
		System.out.println("multipliedResult: " + result);
		
		result = result / 5;
		System.out.println("dividedResultOne: " + result);
		
		result = result % 3;
		System.out.println("dividedResultTwo: " + result);
		
		// result = result + 1;
		result++; // 1 + 1 = 2;
		System.out.println("1 + 1 = " + result);
		
		result--; // 2 - 1 = 1
		System.out.println("2 - 1 = " + result);
		
		// result = result + 2;
		result += 2; // 1 + 2 = 3
		System.out.println("1 + 2 = " + result);
		
		// result = result * 10;
		result *= 10; // 3 * 10 = 30
		System.out.println("3 * 10 = " + result);
		
		// result = result / 3;
		result /= 3; // 30 / 3 = 10
		System.out.println("30 / 3 = " + result);
		
		// result = result - 2
		result -= 2; // 10 - 2 = 8
		System.out.println("10 - 2 = " + result);
	}
}
