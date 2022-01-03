package com.xworkz.drone.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.drone.constant.DBConstant;
import com.xworkz.drone.dto.IcecreamDTO;
import com.xworkz.drone.util.DBUtil;



public class IcecreamDAO {
	public boolean save(IcecreamDTO icecreamDTO) {
		System.out.println("saving...");
		Connection mysql = null;
		try {
			Class.forName(DBConstant.DRIVAER);
			mysql = DBUtil.createConnection();
			
				String sql = "insert into icecream_details values(?,?,?,?)";
				PreparedStatement pstmt=mysql.prepareStatement(sql);
				pstmt.setObject(1, icecreamDTO.getId());
				pstmt.setObject(2, icecreamDTO.getFlavour());
				pstmt.setObject(3, icecreamDTO.getName());
				pstmt.setObject(4, icecreamDTO.getPrice());
				
				
				int rowsAffected = pstmt.executeUpdate(sql);
				System.out.println("Formated output :" +rowsAffected );

				if (rowsAffected == 1) {
					return true;
				}
			
		} 
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(mysql);
			}
		

		return false;
	}

	public boolean deleteById(int id) {
		
		Connection mysql = null;
		try {
			Class.forName(DBConstant.DRIVAER);
			mysql = DBUtil.createConnection();
			
				String sql = "delete from icecream_details where c_id=?";
				PreparedStatement pstmt=mysql.prepareStatement(sql);
				pstmt.setObject(3, id);
				
				int rowsAffected = pstmt.executeUpdate(sql);
				if (rowsAffected == 1)
					return true;

			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(mysql);
			}
		return false;
	}
	public void displayById(int id)
	{
		Connection mysql=null;
		try {
			mysql=DBUtil.createConnection();
			
			String sql="SELECT * FROM icecream_details where c_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(2, id);
			ResultSet rs=stat.executeQuery();
			while(rs.next())
			{
				Object iid=rs.getObject(1);
				System.out.println("id- "+iid);
				Object flavour=rs.getObject(2);
				System.out.println("flavour - "+flavour);
				Object name=rs.getObject(3);
				System.out.println("name- "+name);
				Object price=rs.getObject(4);
				System.out.println("price -"+price);
				
			}
			
		}  catch (SQLException e) {

			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
	}
	
	public void displayAll()
	{
		Connection mysql=null;
		mysql=DBUtil.createConnection();
		
		try {
			
			
			String sql="SELECT* from icecream_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet rs=stat.executeQuery();
			while(rs.next())
			{
				System.err.println("row Started");
				Object id=rs.getObject(1);
				Object flavour=rs.getObject(2);
				Object name=rs.getObject(3);
				Object price=rs.getObject(4);
				System.out.println("Icecream id- "+id+" "+"Icecream flavour- "+flavour+" "+"Icecream name- "+name+" "+"Icecream price- "+price);
				System.err.println("row Ended");
			}
			
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
	}
	
	public void displayTotalRows()
	{
		Connection mysql=null;
       mysql=DBUtil.createConnection();
		
		try {
			String sql="SELECT COUNT(*) from icecream_details";
			PreparedStatement pstmt=mysql.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
			int count=rs.getInt(1);
			System.out.println("Number of rows added in icecream_details table is :"+count);
			}
			
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
	}


}