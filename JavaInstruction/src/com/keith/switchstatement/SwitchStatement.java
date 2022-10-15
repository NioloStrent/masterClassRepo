package com.keith.switchstatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine started.");
			break;

		case "meow":
			System.out.println("Meow.");
			break;

		case "eight":
			System.out.println("Eight!");
			break;

		default:
			System.out.println("Command not recognized.");
			break;
		}

	}

}
