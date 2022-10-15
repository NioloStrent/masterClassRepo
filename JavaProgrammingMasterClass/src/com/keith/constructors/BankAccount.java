package com.keith.constructors;

public class BankAccount {

	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public BankAccount() {
		this(56789, 2.50, "Default name", "Default address", "Default phone number");
		System.out.println("Empty constructor called");
	}
	
	public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void depositFunds(double depositedFunds) {
		balance += depositedFunds;
		
		System.out.println("Deposited " + depositedFunds + " into account.");
		System.out.println("Updated account balance: " + balance);
	}
	
	public void withdrawFunds(double withdrawnFunds) {
		if (balance < withdrawnFunds) {
			System.out.println("Failed to withdraw " + withdrawnFunds + " due to insufficient funds");
		} else {
			balance -= withdrawnFunds;
			System.out.println("Withdrew " + withdrawnFunds + " from account.");
			System.out.println("Updated account balance: " + balance);
		}
	}

}
