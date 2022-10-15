package com.keith.minimumelementchallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class NumericReader {

	/*
	 * Write a method called readIntegers() with a parameter called count that represents
	 * how many integers the user needs to enter.
	 * 
	 * The method needs to read from the console until all numbers are entered,
	 * and then return an array containing the numbers entered.
	 * 
	 * Write a method findMin() with the array as a parameter. The method needs to return
	 * the minimum value in the array.
	 * 
	 * In the main() method, read the count from the console and call the method
	 * readIntegers() with the count parameter.
	 */
	
	private ArrayList<Integer> numericList = new ArrayList<Integer>();
    private int numCount = 0;
    private int currentMin = Integer.MAX_VALUE;
	
	public NumericReader() {
	       
	       Scanner scan = new Scanner(System.in);
	 
	       System.out.print("Enter array size: ");
	       numCount = scan.nextInt();
	 
	       System.out.print("Enter array elements: ");
	       for(int i=0; i<numCount; i++){
	    	   
	    	   int currentValue = scan.nextInt();
	    	   if(currentValue < currentMin) {
	    		   currentMin = currentValue;
	    	   }
	    	   numericList.add(currentValue);
	       }
	}
	
	public int findMin() {
		return currentMin;
	}
	
	
	
	public ArrayList<Integer> getNumericList() {
		return numericList;
	}

	public static void main(String[] args) {
		NumericReader numericReader = new NumericReader();
		System.out.println(numericReader.getNumericList());
		System.out.println("Minimum value: " + numericReader.findMin());
	}
}
