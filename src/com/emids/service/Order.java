package com.emids.service;

import java.util.Scanner;

import com.emids.domain.Customer;

public class Order {
	Scanner scanner = new Scanner(System.in);

	public void placeOrder(Customer customer1) {
		System.out.println("your order is successfully placed to the following ");
		System.out.println("ID------> " + customer1.getCustomerId());
		System.out.println("Name-----> " + customer1.getCustomerName());
		System.out.println("State-----> " + customer1.getState());
		System.out.println("City----->" + customer1.getCity());
		System.out.println("Street---->" + customer1.getStreet());

	}

	public void toOrder() {
		System.out.println("these are the books you selected");

		CustomerBookShelf.CustomerbookShelf1.get();
		System.out.println("you want to remove the books if yes please press 1 else press 0");

		int alter = scanner.nextInt();
		if (alter == 1) {
			CustomerBookShelf.CustomerbookShelf1.modify();
		}

		ShopingCart cart = new ShopingCart();
		int selection = cart.add();
		if (selection != 0) {
			System.out.println("please give your information");
			Customer customer1 = new Customer();
			boolean result = customer1.details();
			if (result) {
				Order order1 = new Order();
				order1.placeOrder(customer1);
			} else {
				System.out.println("Problem in ordering ");
			}
		}

	}

}
