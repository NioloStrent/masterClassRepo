package com.keith.constructors;

public class Main {

	public static void main(String[] args) {
		
//		BankAccount bankAccount = new BankAccount(1234567890, 5000.0, "Michael Anderson", "manderson@hotmail.com", "570-421-7762");
//		
//		System.out.println("Account Number: " + bankAccount.getAccountNumber());
//		System.out.println("Current Balance: " + bankAccount.getBalance());
//		System.out.println("Customer Name: " + bankAccount.getCustomerName());
//		System.out.println("Email Address: " + bankAccount.getEmail());
//		System.out.println("Phone Number: " + bankAccount.getPhoneNumber());
//		
//		bankAccount.depositFunds(5000);
//		
//		bankAccount.withdrawFunds(500);
//		
//		bankAccount.withdrawFunds(50000.0);
		
		// Saves all fields
		VipCustomer vipCustomer1 = new VipCustomer("Wally",30000.00, "wallyweasel@hotmail.com");
		System.out.println("Name: " + vipCustomer1.getName());
		System.out.println("Credit limit: " + vipCustomer1.getCreditLimit());
		System.out.println("Email address: " + vipCustomer1.getEmailAddress());
		
		System.out.println("----------------------------");
		
		// Passes on the two values it receives and uses a default value for the third.
		VipCustomer vipCustomer2 = new VipCustomer("Drei", 30000.00);
		System.out.println("Name: " + vipCustomer2.getName());
		System.out.println("Credit limit: " + vipCustomer2.getCreditLimit());
		
		System.out.println("----------------------------");
		
		// Default constructor
		VipCustomer vipCustomer3 = new VipCustomer();
		System.out.println("Name: " + vipCustomer3.getName());
		System.out.println("Credit limit: " + vipCustomer3.getCreditLimit());
		System.out.println("Email address: " + vipCustomer3.getEmailAddress());

	}

}
