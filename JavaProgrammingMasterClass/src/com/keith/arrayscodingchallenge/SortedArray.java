package com.keith.arrayscodingchallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortedArray {
	//private static Scanner scanner = new Scanner(System.in);

	int[] myIntegers = getIntegers(5);
	Integer[] ints = new Integer[5];

	public SortedArray()
	{
		


		//System.out.println("-------------");

		/*
		Integer[] sortedData = sortIntegers(ints);
		for(int i=0; i<sortedData.length; i++) {
			System.out.println("Element " + i + " contents " + sortedData[i]);
		}
		*/
	}


	public static int[] getIntegers(int number) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter " + number  + " integer values:\r");
		int[] values = new int[number];

		for(int i=0; i<values.length; i++) {
			values[i] = scanner.nextInt();
		}

		return values;
	}

	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
	}

	public static int[] sortIntegers(int[] array) {
		
		int[] sortedDesc = Arrays.stream(array)            // or use, IntStream.of(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
		
		return sortedDesc;
	}
}