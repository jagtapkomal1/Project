package com.account;

import java.util.ArrayList;
import java.util.List;

import com.productentity.Product;

public class AccountService {
	
	List<Product> cartItems = new ArrayList<Product>();

	public void addToCart(Product product) {
		cartItems.add(product);
	}
	
	public void printCartItems() {
        for (Product prod: cartItems) {
            System.out.println(prod.getpName());
        }
    }
}
