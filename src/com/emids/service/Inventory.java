package com.emids.service;

import com.emids.domain.Products;

public class Inventory {
	boolean findBooks(String name) {
		if (name == Products.book.name)
			return true;
		else if (name == Products.book1.name)
			return true;
		else
			return false;
	}

	void search() {
		Inventory.show();
	}

	static void show() {
		Products.getItem();
	}

}
