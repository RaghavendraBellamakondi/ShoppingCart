package com.emids.domain;

public class Products {
	private Products() {

	}

	public static final Book book = Book.getBook("my autograph", 2000, "rama");
	public static final Book book1 = Book.getBook("happy movements", 5000, "Sham");
	public static final Book book2 = Book.getBook("java", 600, "sudeep");
	public static final Book book3 = Book.getBook("java", 9000, "darshan");

	public static void getItem() {
		if (book != null) {
			System.out.println(book.name + "  by  " + book.author + "\t" + "Rs: " + book.price);
		}
		if (book1 != null) {
			System.out.println(book1.name + " by " + book1.author + "\t" + "Rs: " + book1.price);
		}
		if (book2 != null) {
			System.out.println(book2.name + "  by " + book2.author + "\t" + "Rs: " + book2.price);
		}
		if (book3 != null) {
			System.out.println(book3.name + "  by " + book3.author + "\t" + "Rs: " + book3.price);
		}

	}

	static void genaralBook() {
		System.out.println(book.name + " by " + book.author);
		System.out.println(book1.name + " by " + book1.author);

	}

	static void javaBook() {
		System.out.println(book2.name + " by " + book2.author);
		System.out.println(book3.name + " by " + book3.author);
	}

	public static void search(String selection) {
		if (selection.equalsIgnoreCase("java")) {
			Products.javaBook();

		} else if (selection.equalsIgnoreCase("other")) {
			Products.genaralBook();

		} else
			System.out.println("no books are available");

	}
}
