package com.emids.service;

import com.emids.domain.Customer;

public class Order {
	public void placeOrder(Customer customer1) {
		System.out.println("your order is successfully placed to the following ");
		System.out.println("ID------> " + customer1.getCustomerId());
		System.out.println("Name-----> " + customer1.getCustomerName());
		System.out.println("State-----> " + customer1.getState());
		System.out.println("City----->" + customer1.getCity());
		System.out.println("Street---->" + customer1.getStreet());

	}

}
