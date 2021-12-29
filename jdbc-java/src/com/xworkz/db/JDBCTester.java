package com.xworkz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester {

	public static void main(String[] args) {
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/btm";
			String userName = "root";
			String password = "@Pacchu3";
			mysql = DriverManager.getConnection(url, userName, password);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(1,'Night club','btm',5,500,true)";
				Statement statement=mysql.createStatement();
				statement.execute(sql);
			    System.out.println(sql);
			    
				String sql1="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(2,'Maharaj club','Bagalkot',3,200,false)";
			    Statement statement1=mysql.createStatement();
				statement1.execute(sql1);
			    System.out.println(sql1);
			    
				String sql2="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(3,'Dreams club','Vidhyagiri',7,300,false)";
			    Statement statement2=mysql.createStatement();
				statement2.execute(sql2);
			    System.out.println(sql2);
			    
				String sql3="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(4,'Raju club','Vidhyagiri21',2,100,true)";
			    Statement statement3=mysql.createStatement();
				statement3.execute(sql3);
			    System.out.println(sql3);
			    
				String sql4="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(5,'Pacchu club','Navanagar',3,400,true)";
			    Statement statement4=mysql.createStatement();
				statement4.execute(sql4);
			    System.out.println(sql4);
			    
				String sql5="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(6,'Ram club','Vidhyagiri#20',2,300,false)";
			    Statement statement5=mysql.createStatement();
				statement5.execute(sql5);
			    System.out.println(sql5);
			    
				String sql6="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(7,'vinayak club','Kamatagi',5,500,true)";
			    Statement statement6=mysql.createStatement();
				statement6.execute(sql6);
			    System.out.println(sql6);
			    
				String sql7="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(8,'Manju club','Vidhyagiri',9,900,false)";
			    Statement statement7=mysql.createStatement();
				statement7.execute(sql7);
			    System.out.println(sql7);
			    
				String sql8="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(9,'Abhi club','Vidhyagiri',1,600,true)";
			    Statement statement8=mysql.createStatement();
				statement8.execute(sql8);
			    System.out.println(sql8);
			    
				String sql9="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(10,'Sai club','Vidhyagiri',6,700,false)";
				Statement statement9=mysql.createStatement();
				statement9.execute(sql9);
			    System.out.println(sql9);
				
							}
			System.out.println("after driver is loaded and registered");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				try {

					mysql.close();
					System.out.println("Closed the resource");

				} catch (SQLException e) {

					e.printStackTrace();
				}

			}

		}

	}
}
