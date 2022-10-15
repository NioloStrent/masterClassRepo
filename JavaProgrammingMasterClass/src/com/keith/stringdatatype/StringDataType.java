package com.keith.stringdatatype;

public class StringDataType {

	public static void main(String[] args) {

		String myString = "This is a string";

		System.out.println("myString: " + myString);
		myString = myString + ", and this is more.";

		System.out.println("myString appended: " + myString);

		myString = myString + " \u00A9 2019";

		System.out.println("myString copyright: " + myString);

		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println("numberString: " + numberString);

		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;

		System.out.println("lastString is equal to: " + lastString);

		double doubleNumber = 120.47d;
		lastString = lastString + doubleNumber;
		System.out.println("lastString is equal to: " + lastString);

	}

}
