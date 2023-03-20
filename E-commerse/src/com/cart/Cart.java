package com.cart;

public class Cart {
	private String pname;
	  private int qty;
	  private double price;
	  private double totalPrice;
	  
	  Cart(String pname, int qty, double price, double totalPrice) {
	    this.pname = pname;
	    this.qty = qty;
	    this.price = price;
	    this.totalPrice = totalPrice;
	  }

	  public String getPname() {
	    return pname;
	  }
	  public int getQty() {
	    return qty;
	  }
	  public double getPrice() {
	    return price;
	  }
	  public double getTotalPrice() {
	    return totalPrice;
	  }
	 
	  public static void displayFormat() {
	    System.out.print("\nName      Quantity    Price   Total Price\n");
	  }
	  
	  public void display() {
	    System.out.format("%-9s %8d %10.2f %10.2f\n",pname, qty, price, totalPrice);
	  }
	
}
