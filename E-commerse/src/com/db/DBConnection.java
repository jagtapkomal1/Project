package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	    public static Connection createConnection() throws SQLException{
	    
	    	Connection connection = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerse", "root", "password");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			return connection;
	    }
}
