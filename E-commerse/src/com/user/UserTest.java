package com.user;

import java.util.Scanner;

import com.account.AccountService;
import com.product.ProductInterface;
import com.product.ProductService;
import com.productentity.Product;

public class UserTest {
	public static void userInfo() {
        Scanner sc=new Scanner(System.in);

        UserInterface ui = new UserService();
        System.out.println("Welcome to user");
        while(true){
            System.out.println("\n1.Add user" +
                    "\n2.Login user" +
                    "\n3.Exit");
            System.out.println("Enter choice");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                	System.out.println("User : ");
                    System.out.println("Enter first name : ");
                    String fName = sc.next();
                    System.out.println("Enter last name : ");
                    String lName = sc.next();
                    System.out.println("Enter mobile number : ");
                    double mobNo = sc.nextDouble();
                    System.out.println("Enter your city : ");
                    String city = sc.next();
                    System.out.println("Enter user name : ");
                    String uName = sc.next();
                    System.out.println("Enter password : ");
                    String password = sc.next();
                    User u = new User(fName,lName,mobNo,city,uName,password);
                    boolean flag = ui.addUser(u);
                    if(flag) {
                    	System.out.println("User record successfully");
                    }else {
                    	System.out.println("something went wrong, please try again");
                    }
                    break;
                case 2:
                	System.out.println("Admin Login : ");
                    System.out.println("Enter user name :");
                    String userName = sc.next();
                    System.out.println("Enter password :");
                    String password2 = sc.next();
                    boolean flag1 =  ui.UserLogin(userName, password2);
                    if(flag1) {
                    	System.out.println("\n1.Show All Product Details " +
                                "\n2.Get product by id " +
                                "\n3.add to cart " +
                                "\n4.Get product by id " +
                                "\n5.Exit");
                    	int choice = sc.nextInt();
                    	ProductService pdi=new ProductService();
                    	if(choice == 1) {
                    		pdi.showAllProduct();
                    	}else if(choice == 2) {
                    		System.out.println("Enter product id ");
                    		int id = sc.nextInt();
                    		pdi.showProductById(id);
                    	}else if(choice == 3) {
                    		AccountService account = new AccountService();
                    		Product p = new Product();
                    		account.addToCart(null);
                    	}
                    	
                    }else {
                    	System.out.println("something went wrong, please try again");
                    }
                    break;
                case 3:
                    System.out.println("Thank You for using Group Q E-commerse!!!");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choice..");
            }
         
        }
    }
}
