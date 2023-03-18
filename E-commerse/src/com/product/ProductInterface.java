package com.product;

import com.productentity.Product;

public interface ProductInterface {
	public boolean insertProduct(Product p);
    public boolean delete(int id);
    public boolean update(int id,String update,int ch,Product p);
    public void showAllProduct();
    public boolean showProductById(int id);
}
