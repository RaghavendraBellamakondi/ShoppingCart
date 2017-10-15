package com.emids.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.emids.domain.Book;

public class CustomerBookShelf {
	public static ArrayList<Book> list = new ArrayList<>();
	public static final CustomerBookShelf CustomerbookShelf1 = new CustomerBookShelf();

	public void get() {
		System.out.println(list);
	}

	public void modify() {
		Scanner scanner = new Scanner(System.in);
		boolean condition = true;
		while (condition) {
			System.out.println("please enter which one you want to delete press according to this[0,1,2,...] ");
			int index = scanner.nextInt();
			list.remove(index);
			System.out.println("you want to remove again if yes please Enter 1 else 0");

			int entry = scanner.nextInt();
			if (entry == 1) {
				condition = true;

			} else
				condition = false;
		}
		System.out.println("modified list is ");
		System.out.println(list);

	}
}
