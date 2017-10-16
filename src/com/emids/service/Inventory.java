package com.emids.service;

import com.emids.domain.Products;

public class Inventory {

	void search() {
		Inventory.show();
	}

	static void show() {
		Products.getItem();
	}

}
