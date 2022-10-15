package com.keith.arrays;

public class Arrays {

	public static void main(String[] args) {
		
		int[] arrayValues;
		
		arrayValues = new int[3];
		
		arrayValues[0] = 10;
		arrayValues[1] = 20;
		arrayValues[2] = 300;
		
		System.out.println(arrayValues[0]);
		System.out.println(arrayValues[1]);
		System.out.println(arrayValues[2]);
		
		System.out.println(arrayValues.length);
		
		for(int i=0; i<arrayValues.length; i++) {
			System.out.println(arrayValues[i]);
		}
		
		int[] numbers = {5, 6, 7};
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
