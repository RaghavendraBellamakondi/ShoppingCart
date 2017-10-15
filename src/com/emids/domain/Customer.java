package com.emids.domain;

import java.util.Scanner;

public class Customer implements User {
	private int customerId = 100;
	private String customerName = "Raghavendra";
	private String street;
	private String city;
	private String state;
	private long password = 12345l;

	public boolean details() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your Id");
		int id = scanner.nextInt();
		if (id == this.customerId) {
			System.out.println("please enter your name");
			String name = scanner.next();

			if (name.equalsIgnoreCase(this.customerName)) {
				System.out.println("please enter state name");
				this.state = scanner.next();
				System.out.println("please enter city name");
				this.city = scanner.next();

				System.out.println("please enter street name");
				this.street = scanner.next();
				return true;
			} else
				System.out.println("not a valid name");
			return false;
		} else
			System.out.println("it's not a valid id please enter valid id");
		return false;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	@Override
	public boolean getValidation() {
		System.out.println("please enter the user name and pass word");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		long password = scanner.nextLong();
		return (name.equals("Raghavendra") && password == 12345l);
	}
}
