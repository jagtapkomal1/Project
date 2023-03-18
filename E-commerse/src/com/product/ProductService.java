package com.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.db.DBConnection;
import com.productentity.Product;

public class ProductService implements ProductInterface {

	@Override
	public boolean insertProduct(Product p) {
		boolean flag=false;
        try{
            Connection con= DBConnection.createConnection();
            String query="insert into product_details(pName,price,quantity,description) value(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,p.getpName());
            pst.setLong(2,p.getPrice());
            pst.setLong(3,p.getQuantity());
            pst.setString(4,p.getDescription());
            pst.executeUpdate();
            flag=true;

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return flag;
	}

	@Override
	public boolean delete(int id) {
		boolean flag=false;
        try{
            Connection con=DBConnection.createConnection();
            String query="delete from product_details where id="+id;
            PreparedStatement pst=con.prepareStatement(query);
            pst.executeUpdate();
            flag=true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
	}

	@Override
	public boolean update(int id, String update, int ch, Product p) {
		int choice=ch;
        boolean flag=false;
        try{
            if(choice==1){
                Connection con=DBConnection.createConnection();
                String query="update product_details set pName=? where id=?";
                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1,update);
                ps.setInt(2,id);
                ps.executeUpdate();
                flag=true;

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return flag;
	}

	@Override
	public void showAllProduct() {
		try{
            Connection con=DBConnection.createConnection();
            String query="select * from product_details";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("id: "+rs.getInt(1)+"\n" +
                        "pName: "+rs.getString(2)+"\n" +
                        "price: "+rs.getLong(3)+"\n" +
                        "quantity: "+rs.getLong(4)+"\n" +
                        "description: "+rs.getString(5));
                System.out.println("----------------------------------");
            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
		
	}

	@Override
	public boolean showProductById(int id) {
		
		boolean flag=false;
        try{

            Connection con=DBConnection.createConnection();
            String query="select * from product_details where id="+id;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
            	System.out.println("id: "+rs.getInt(1)+"\n" +
                        "pName: "+rs.getString(2)+"\n" +
                        "price: "+rs.getLong(3)+"\n" +
                        "quantity: "+rs.getLong(4)+"\n" +
                        "description: "+rs.getString(5));
                //System.out.println("----------------------------------");
                flag=true;

            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        return flag;
	}
	
	
}
