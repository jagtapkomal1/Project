package com.main;

import java.util.Scanner;

import com.Admin.AdminTest;
import com.product.ProductInterface;
import com.product.ProductService;
import com.productentity.Product;
import com.user.UserTest;

public class Client {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);

	        ProductInterface pdi=new ProductService();
	        System.out.println("Welcome to Group Q E-commerse");
	        while(true){
	            System.out.println("\n1.Admin" +
	                    "\n2.User " +
	                    "\n3.Product " +
	                    "\n4.Guest "+
	                    "\n5.Exit");
	            System.out.println("Enter choice");
	            int ch=sc.nextInt();
	            switch (ch){
	                case 1:
	                    System.out.println("Admin : ");
	                    AdminTest test = new AdminTest();
	                    test.adminInfo();
	                    break;
	                case 2:
	                	System.out.println("User : ");
	                	UserTest.userInfo();
	                    break;
	                case 3:
	                    
	                    break;
	                case 4:
	                    
	                    break;
	                case 5:
	                    System.out.println("Thank You for using Group Q E-commerse!!!");
	                    System.exit(0);
	                default:
	                    System.out.println("Please enter valid choice..");
	            }
	           
	        }
	}
}
