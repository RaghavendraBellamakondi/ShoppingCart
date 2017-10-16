package com.emids.service;

import java.util.ArrayList;

import com.emids.domain.Book;

public class ShopingCart {
	public int add() {
		ArrayList<Book> list2 = new ArrayList<>(CustomerBookShelf.CustomerbookShelf1.list);
		int sum = 0;
		int count = 0;
		for (Book book : list2) {

			sum = sum + book.price;
			count++;
		}
		System.out.println("you selected " + count + " books");
		System.out.println("and the total price is= " + sum);
		if (count == 0)
			return 0;
		else
			return 1;
	}
}