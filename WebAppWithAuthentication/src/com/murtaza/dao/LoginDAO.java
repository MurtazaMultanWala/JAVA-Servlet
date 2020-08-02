package com.murtaza.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

	
	String url = "jdbc:mysql://localhost:3306/webappwithauthentication";
	String usernameDb = "root";
	String passwordDb = "murtaza123";
	String query = "select * from usercredentials where username=? and password=?";
	
	public boolean checkCredentials(String username, String password) {
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(
					url, usernameDb, passwordDb);
			
			PreparedStatement st = connection.prepareStatement(query);
			st.setString(1, username);
			st.setString(2, password);
			
			ResultSet resultSet = st.executeQuery();
			
			if(resultSet.next())
		 		return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		return false;
	}
}
