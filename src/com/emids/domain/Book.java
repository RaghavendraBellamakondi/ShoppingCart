package com.emids.domain;

public class Book {
	public static int count = 0;
	public String name;
	public int price;
	public String author;

	Book(String name, int price, String author) {
		count++;
		this.name = name;
		this.price = price;
		this.author = author;
	}

	static Book getBook(String name, int price, String author) {
		if (count < 4)
			return new Book(name, price, author);
		else
			return null;
	}

	@Override
	public String toString() {

		return this.name + "  by " + this.author;
	}

}
