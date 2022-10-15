package com.keith.primitivetypes;

public class PrimitiveTypes {

	public static void main(String[] args) {
		
		// byte
		// short
		// int
		// long
		// float
		// double
		// char
		// boolean
		
		int myValue = 10000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		
		int myMaxIntValue = Integer.MAX_VALUE;
		
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
		System.out.println("Busted MIN value = " + (myMinIntValue - 1));
		
		int myMaxIntTest = 2147483647;
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		
		System.out.println("Byte Minimum Value - " + myMinByteValue);
		System.out.println("Byte Maximum Value - " + myMaxByteValue);
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		
		System.out.println("Short Minimum Value - " + myMinShortValue);
		System.out.println("Short Maximum Value - " + myMaxShortValue);
		
		long myLongValue = 100L;
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		
		System.out.println("myLongValue - " + myLongValue);
		System.out.println("Long Minimum Value - " + myMinLongValue);
		System.out.println("Long Maximum Value - " + myMaxLongValue);
		
		short bigShortLiteralValue = 32767;
		
		int myTotal = (myMinIntValue / 2);
		
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		
		// short myNewShortValue = (short) (myNewShortValue / 2);
		
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		
		System.out.println("Float Minimum Value - " + myMinFloatValue);
		System.out.println("Float Maximum Value - " + myMaxFloatValue);
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		
		System.out.println("Double Minimum Value - " + myMinDoubleValue);
		System.out.println("Double Maximum Value - " + myMaxDoubleValue);
		
		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5.00 / 3.00;
		
		System.out.println("myIntValue: " + myIntValue);
		System.out.println("myFloatValue: " + myFloatValue);
		System.out.println("myDoubleValue: " + myDoubleValue);
		
		double numberOfPounds = 200d;
		double convertedKilograms = numberOfPounds * 0.45359237;
		
		System.out.println("convertedKilograms: " + convertedKilograms);
		
		double pi = 3.1415927d;
		double anotherNumber = 3000000.4567890d;
		System.out.println("pi: " + pi);
		System.out.println("anotherNumber: " + anotherNumber);
		
		char myChar = 'D';
		char myUnicodeChar = '\u00A9';
		boolean myBool = true;
		
		System.out.println("myChar: " + myChar);
		System.out.println("myUnicodeChar: " + myUnicodeChar);
		System.out.println("myBool: " + myBool);
		
		
	}

}
