package com.keith.constructors;

public class VipCustomer {
	private String name;
	private Double creditLimit;
	private String emailAddress;
	
	public VipCustomer() {
		this("Default", 3600.00, "default@gmail.com");
	}

	public VipCustomer(String name, Double creditLimit) {
		this(name, creditLimit, "unknown@email.com");
	}
	
	public VipCustomer(String name, Double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
}
