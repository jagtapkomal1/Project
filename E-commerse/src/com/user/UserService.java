package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.db.DBConnection;
import com.main.MainTest;

public class UserService implements UserInterface{

	@Override
	public boolean addUser(User u) {
		boolean flag=false;
        try{
            Connection con= DBConnection.createConnection();
            String query="insert into user_details(firstName,lastName,mobNum,city,userName,password) value(?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,u.getFirstName());
            pst.setString(2,u.getLastName());
            pst.setDouble(3,u.getMobNum());
            pst.setString(4,u.getCity());
            pst.setString(5,u.getUserName());
            pst.setString(6,u.getPassword());
            pst.executeUpdate();
            flag=true;

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
		return flag;
	}

	@Override
	public boolean UserLogin(String uName, String password) {
		boolean flag=false;
        try{
            Connection con= DBConnection.createConnection();
            String query="select * from user_details where userName='"+uName+"' && password='" + password +"'";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
            	System.out.println("Login succesfully...");
               // MainTest.productInfo();
                flag=true;
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
		return flag;
	}

}
