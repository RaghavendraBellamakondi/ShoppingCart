
package com.emids.main;

import java.util.Scanner;

import com.emids.domain.Products;
import com.emids.service.CustomerBookShelf;

public class OnlineBookshop {
	Scanner scanner = new Scanner(System.in);
	static CustomerBookShelf customer = CustomerBookShelf.CustomerbookShelf1;

	static void buyBook(String bookname, String authorName) {

		if (bookname.equalsIgnoreCase("java") && authorName.equalsIgnoreCase("sudeep")) {

			customer.list.add(Products.book2);
		} else if (bookname.equalsIgnoreCase("java") && authorName.equalsIgnoreCase("darshan")) {
			customer.list.add(Products.book3);
		} else if (bookname.equalsIgnoreCase("happy movements") && authorName.equalsIgnoreCase("sham")) {
			customer.list.add(Products.book1);
		} else if (bookname.equalsIgnoreCase("my autograph") && authorName.equalsIgnoreCase("rama")) {
			customer.list.add(Products.book);
		} else
			System.out.println("please Enter valid book name and auther name ");
	}

	void showAll(boolean valid) {
		System.out.println("In our shop we have all these books");
		{

			Products.getItem();

		}
	}

	void searchbyNameandAuthor() {

		System.out.println("Enter which section u want related to java or other");

		String section = scanner.nextLine();
		Products.search(section);
	}

	void buyProducts() {

		System.out.println("u want to buy a book if yes please type 1 else type 0");
		int buy = scanner.nextInt();
		if (buy == 1) {
			while (buy == 1) {
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("please Enter book name as mentioned above ");
				String bookname = scanner1.nextLine();
				System.out.println("please Enter book author as mentioned above");
				String authorName = scanner1.nextLine();
				OnlineBookshop.buyBook(bookname, authorName);
				System.out.println("you want to save some more please Enter 1 else Enter 0");
				int o = scanner1.nextInt();
				buy = o;
			}

		} else if (buy == 0) {
			System.out.println("thank you");
			System.exit(0);
		}
	}

}
