package com.main;

import java.util.Scanner;

import com.product.ProductInterface;
import com.product.ProductService;
import com.productentity.Product;

public class MainTest {
	public static void productInfo() {
        Scanner sc=new Scanner(System.in);

        ProductInterface pdi=new ProductService();
        System.out.println("Welcome to Group Q E-commerse");
        while(true){
            System.out.println("\n1.Add product" +
                    "\n2.Show All Products+" +
                    "\n3.Get product based on id+" +
                    "\n4.Delete Product"+
                    "\n5.Update Product" +
                    "\n6.Exit");
            System.out.println("Enter choice");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Add Product");
                    System.out.println("Enter Product name");
                    String name=sc.next();
                    System.out.println("Enter Price");
                    long price=sc.nextLong();
                    System.out.println("Enter Quantity");
                    long quantity=sc.nextLong();
                    System.out.println("Enter description");
                    String description=sc.next();
                    Product p=new Product(name,price,quantity,description);
                    boolean ans=pdi.insertProduct(p);
                    if(ans)
                        System.out.println("Record inserted Successfully!!!");
                    else
                        System.out.println("something went wrong, please try again");

                    break;
                case 2:
                    System.out.println("Show all products ");
                    pdi.showAllProduct();

                    break;
                case 3:
                    System.out.println("Get product based on id ");
                    System.out.println("enter id ");
                    int id=sc.nextInt();
                  boolean f=  pdi.showProductById(id);
                  if(!f)
                      System.out.println("Product with this id is not available in our system");

                    break;
                case 4:
                    System.out.println("Delete Product");
                    System.out.println("enter id to delete");
                    int id1=sc.nextInt();
                    boolean ff=pdi.delete(id1);
                    if(ff)
                        System.out.println("Record deleted successfully...");
                    else
                        System.out.println("Something went wrong");
                    break;
                case 5:
                    System.out.println("Update the product");
                    System.out.println("\n1.Update name\n2.Update price");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1){
                        System.out.println("enter id");
                        int id2=sc.nextInt();
                        System.out.println("Enter new name");
                        String pname=sc.next();
                        Product std=new Product();
                        std.setpName(pname);
                      boolean flag=  pdi.update(id2,pname,choice,std);
                      if(flag)
                          System.out.println("Name updated successfully");
                      else
                          System.out.println("Something went wrong...");
 }
                    break;
                case 6:
                    System.out.println("Thank You for using Group Q E-commerse!!!");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choice..");
            }
           
        }
    }
}
