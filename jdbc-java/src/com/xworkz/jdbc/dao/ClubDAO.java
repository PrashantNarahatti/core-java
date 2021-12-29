package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.ClubConstant;
import com.xworkz.jdbc.dto.ClubDTO;

public class ClubDAO {
	
	public boolean save(ClubDTO clubDTO) {
		System.out.println("saving...");
		 Connection mysql=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mysql=DriverManager.getConnection(ClubConstant.MYSQL_URL,ClubConstant.MYSQL_NAME,ClubConstant.MYSQL_PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql="insert into club values("+clubDTO.getId()+",'"+clubDTO.getName()+"','"+clubDTO.getLocation()+"',"+clubDTO.getBouncers()+","+clubDTO.getEntryFee()+","+clubDTO.isActive()+")";
				Statement statement=mysql.createStatement();
				System.out.println(sql);
				int rowsAffected=statement.executeUpdate(sql);
			    
			    if(rowsAffected==1) {
			    	return true;
			    }
			}
			    } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			if(mysql!=null)
			{
				try {
					mysql.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		return false;
	}
	
	public boolean delete(int id) {
		System.out.println("deleting...");
		 Connection mysql=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mysql=DriverManager.getConnection(ClubConstant.MYSQL_URL,ClubConstant.MYSQL_NAME,ClubConstant.MYSQL_PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql="delete into club where id=+id";
				Statement statement=mysql.createStatement();
				System.out.println(sql);
				int rowsAffected=statement.executeUpdate(sql);
			    if(rowsAffected==1) {
			    	return true;
			    }
			}
			    } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			if(mysql!=null)
			{
				try {
					mysql.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		return false;
	}
		
	}


