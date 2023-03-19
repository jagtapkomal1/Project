package com.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.db.DBConnection;
import com.main.MainTest;

public class AdminService implements AdminInterface {

	@Override
	public boolean addAdmin(Admin a) {
		boolean flag=false;
        try{
            Connection con= DBConnection.createConnection();
            String query="insert into admin_details(firstName,lastName,userName,password) value(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,a.getFirstName());
            pst.setString(2,a.getLastName());
            pst.setString(3,a.getUserName());
            pst.setString(4,a.getPassword());
            pst.executeUpdate();
            flag=true;

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
		return false;
	}
	
	@Override
	public void adminLogin(String uName, String password) {
		boolean flag=false;
        try{
            Connection con= DBConnection.createConnection();
            String query="select * from admin_details where userName='"+uName+"' && password='" + password +"'";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
            	System.out.println("Login succesfully...");
            	MainTest main = new MainTest();
                main.productInfo();
                flag=true;
            flag=true;
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
	
	}
	
	
	
	
	
	
	@Override
	public void showAdminDetails() {
		try{
            Connection con=DBConnection.createConnection();
            String query="select * from admin_details";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("id: "+rs.getInt(1)+"\n" +
                        "firstName: "+rs.getString(2)+"\n" +
                        "lastName: "+rs.getString(3)+"\n" +
                        "userName: "+rs.getString(4)+"\n" +
                        "password: "+rs.getString(5));
                System.out.println("----------------------------------");
            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
		
	}
}
