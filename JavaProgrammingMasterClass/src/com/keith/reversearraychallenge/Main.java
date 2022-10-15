package com.keith.reversearraychallenge;

import java.util.Arrays;

public class Main {

	/*
	 * Write a method called reverse with an int array as a parameter.
	 * The method should not return any value.
	 * In other words, the method is allowed to modify the array parameter.
	 * In main(), test the reverse method and print the array both reversed and non-reversed.
	 * To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
	 * For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
	 */
	
	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		System.out.println("Unreversed Array: " + Arrays.toString(intArray));
		reverse(intArray);
	}
	
	private static void reverse(int[] array) {
		// Arrays.sort(array, Collections.reverseOrder());
		int reversedArrayIndex = 0;
		int[] reversedArray = new int[array.length];
		
		for(int i = (array.length - 1); i >= 0; i--) {
			reversedArray[reversedArrayIndex] = array[i];
			reversedArrayIndex++;
		}
		System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
	}

}
