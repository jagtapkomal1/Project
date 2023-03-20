package com.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyCart {
	public static void main(String[] args) {
	    
		   
	    String productName = null;
	    int quantity = 0;
	    double price = 0.0;
	    double totalPrice = 0.0;
	    double overAllPrice = 0.0;
	    char choice = '\0';
	    
	    Scanner scan = new Scanner(System.in);
         List<Cart> cart = new ArrayList<Cart>();

	    do {
	     
	      System.out.println("Enter product details:");
	      System.out.print("Name: ");
	      productName = scan.nextLine();
	      System.out.print("Quantity: ");
	      quantity = scan.nextInt();
	      System.out.print("Price (per item): ");
	      price = scan.nextDouble();

	      totalPrice = price * quantity;

	      overAllPrice += totalPrice;
	     
	      cart.add( new Cart( productName, quantity, price, totalPrice) );

	      System.out.print("Want to add more item? (y or n): ");
	      choice = scan.next().charAt(0); 
	      scan.nextLine();
	    } 
	    
	    while (choice == 'y' || choice == 'Y');
	    Cart.displayFormat();
	    for (Cart p : cart) {
	      p.display();
	    }

	    System.out.println("\nTotal Price = " + overAllPrice);
	    scan.close();
	  }
}
