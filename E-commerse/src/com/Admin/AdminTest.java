package com.Admin;

import java.util.Scanner;

import com.main.MainTest;
import com.product.ProductInterface;
import com.product.ProductService;
import com.productentity.Product;

public class AdminTest {
	public static void adminInfo() {
        Scanner sc=new Scanner(System.in);

        AdminInterface adi = new AdminService();
        System.out.println("Welcome to Admin");
        while(true){
            System.out.println("\n1.Add Admin" +
                    "\n2.Login admin" +
                    "\n3.Exit");
            System.out.println("Enter choice");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                	System.out.println("Admin : ");
                    System.out.println("Enter first name : ");
                    String fName = sc.next();
                    System.out.println("Enter last name : ");
                    String lName = sc.next();
                    System.out.println("Enter user name : ");
                    String uName = sc.next();
                    System.out.println("Enter password : ");
                    String password = sc.next();
                    Admin a = new Admin(fName,lName,uName,password);
                    boolean flag = adi.addAdmin(a);
                    if(flag) {
                    	System.out.println("Admin record successfully");
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
                  adi.adminLogin(userName, password2);
                  

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
