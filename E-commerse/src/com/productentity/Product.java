package com.productentity;

public class Product {
	private int id;
    private String pName;
    private long price;
    private long quantity;
    private String description;
    
    public Product() {
    	
    }
    
    public Product(String pName, long price, long quantity, String description) {
		super();
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}
    
	public Product(int id, String pName, long price, long quantity, String description) {
		super();
		this.id = id;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pName=" + pName + ", price=" + price + ", quantity=" + quantity
				+ ", description=" + description + "]";
	}
    
}
