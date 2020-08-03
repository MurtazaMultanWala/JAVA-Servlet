package com.murtaza.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.murtaza.web.model.AllienModel;

public class AllienDAO {

	String url = "jdbc:mysql://localhost:3306/servletdemo";
	String usernameDb = "root";
	String passwordDb = "murtaza123";
	Connection connection;
	
	public void InitializeDatabase() {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, usernameDb, passwordDb);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}	
	}
	
	public AllienModel getAllienData(int id) {
		
		AllienModel allienModel = new AllienModel();
		try 
		{
			InitializeDatabase();
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("select * from aliendata where id=" + id);
			connection.close();	
			
				if(resultSet.next()) {
					allienModel.setId(resultSet.getInt("id"));
					allienModel.setName(resultSet.getString("name"));
					allienModel.setTech(resultSet.getString("tech"));
					return allienModel;	
				}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return null;	
	}
	
	
	public void addAllienData(AllienModel allienModel) {
		
		try 
		{
			InitializeDatabase();
			
			String query = "insert into aliendata (id, name, tech)" + " values(?,?,?)";

			
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, allienModel.getId());
			ps.setString(2, allienModel.getName());
			ps.setString(3, allienModel.getTech());
			
			ps.execute();		
			connection.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
}
