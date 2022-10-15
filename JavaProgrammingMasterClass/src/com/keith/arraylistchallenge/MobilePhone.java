package com.keith.arraylistchallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	
	private ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	private static Scanner scanner = new Scanner(System.in);
	
	public void addContact(Contact contact) {
		contactList.add(contact);
	}
	
	public void printContactList() {
		System.out.println("You have " + contactList.size() + " contacts in your mobile phone.");
		for (int i = 0; i < contactList.size(); i++) {
			System.out.println((i + 1) + ". " + contactList.get(i));
		}
	}
	
	public void modifyContact(Contact currentContact, Contact newContact) {
		int position = findContact(currentContact);
		if (position >= 0) {
			modifyContact(position, newContact);
		}
	}
	
	private void modifyContact(int position, Contact newContact) {
		contactList.set(position, newContact);
		System.out.println("Contact " + (position + 1) + " has been modified.");
	}
	
	public void removeContact(Contact contact) {
		int position = findContact(contact);
		if (position >= 0) {
			removeContact(position);
		}
	}

	private void removeContact(int position) {
		contactList.remove(position);
	}

	private int findContact(Contact searchContact) {
		return contactList.indexOf(searchContact);
	}

	public boolean onFile(Contact searchContact) {
		int position = findContact(searchContact);
		if (position >= 0) {
			return true;
		}

		return false;
	}
	
	public static void printMenu() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of contacts.");
		System.out.println("\t 2 - To add an contact to the mobile phone.");
		System.out.println("\t 3 - To modify an contact in the mobile phone.");
		System.out.println("\t 4 - To remove an contact from the mobile phone.");
		System.out.println("\t 5 - To search for an contact in the mobile phone.");
		System.out.println("\t 6 - To quit the application.");
	}

	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone();
		boolean quit = false;
		int choice = 0;
		
		Contact keith = new Contact("Keith", "540-322-2101");
		Contact keithChange = new Contact("Keith", "532-123-1301");

		printMenu();

		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				printMenu();
				break;
			case 1:
				mobilePhone.printContactList();
				break;
			case 2:
				mobilePhone.addContact(keith);
				break;
			case 3:
				mobilePhone.modifyContact(keith, keithChange);
				break;
			case 4:
				mobilePhone.removeContact(keithChange);
				break;
			case 5:
				mobilePhone.findContact(keithChange);
				break;
			case 6:
				quit = true;
				break;
				
			}
			
		}
	}

}
