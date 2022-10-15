package com.keith.arrayschallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	// Create a program using arrays that sorts a list of integers in descending order.
	// Descending order is highest value to lowest.
	// In other words if the array had the values 106, 26, 81, 5, 15 in it, your program should
	// ultimately have an array with 106, 81, 26, 15, 5 in it.
	// Set up the program so that the numbers to sort are read in from the keyboard.
	// Implement the following methods - getIntegers, printArray, and sortIntegers
	// getIntegers returns an array of entered integers from keyboard.
	// printArray prints out the contents of the array
	// and sortIntegers should sort the array and return a new array containing the sorted numbers.
	// you will have to figure out how to copy the array elements from the passed array into a new
	// array and sort them and return the new sorted array.

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);
		Integer[] ints = new Integer[5];
		for(int i=0; i<myIntegers.length; i++) {
			System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
			ints[i] = myIntegers[i];
		}
		
		System.out.println("-------------");
		
		Integer[] sortedData = sortIntegers(ints);
		for(int i=0; i<sortedData.length; i++) {
			System.out.println("Element " + i + ", sorted typed value was " + sortedData[i]);
			// ints[i] = sortedData[i];
		}
	}

	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number  + " integer values:\r");
		int[] values = new int[number];
		
		for(int i=0; i<values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		return printArray(values);
	}
	
	public static int[] printArray(int[] array) {
        return array;
	}
	
	public static Integer[] sortIntegers(Integer[] array) {
		
        Arrays.sort(array, Collections.reverseOrder());
  
        return array;
	}

}
