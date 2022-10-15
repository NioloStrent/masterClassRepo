package com.keith.primitiveschallenge;

public class PrimitivesChallenge {

	public static void main(String[] args) {
		
		byte myByte = 5;
		short myShort = 3;
		int myInt = 7;
		
		long myLong = 50000L + 10L * (myByte + myShort + myInt);
		
		System.out.println(myLong);

	}

}
