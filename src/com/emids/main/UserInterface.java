package com.emids.main;

import java.util.Scanner;

import com.emids.domain.Customer;
import com.emids.domain.User;

public class UserInterface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		User user1 = new Customer();
		Boolean valid = user1.getValidation();
		if (valid) {
			OnlineBookshop shop = new OnlineBookshop();
			boolean condition = true;
			while (condition) {
				System.out.println("please Enter your choice " + "\n" + "1)To view all books" + " \n"
						+ "2)to search books by bookname and author name" + "\n" + "3)for buy the books" + "\n"
						+ "4)to view the orders" + "\n" + "5)exit");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					shop.showAll(valid);
					break;
				case 2:
					shop.searchbyNameandAuthor();
					break;
				case 3:
					shop.buyProducts();
					break;
				case 4:
					shop.toOrder();
					break;
				case 5:
					System.out.println("thank you ....");
					condition = false;
					System.exit(0);
				}
				System.out.println("\n");
			}
		}

		else {
			System.out.println("please enter valid user name and password");
		}

	}
}