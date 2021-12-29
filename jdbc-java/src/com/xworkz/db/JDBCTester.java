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
				//String sql="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(1,'Night club','btm',5,500,true)";
				//String sql1="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(2,'Maharaj club','Bagalkot',3,200,false)";
				//String sql2="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(3,'Dreams club','Vidhyagiri',7,300,false)";
				//String sql3="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(4,'Raju club','Vidhyagiri21',2,100,true)";
				//String sql4="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(5,'Pacchu club','Navanagar',3,400,true)";
				//String sql5="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(6,'Ram club','Vidhyagiri#20',2,300,false)";
				//String sql6="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(7,'vinayak club','Kamatagi',5,500,true)";
				//String sql7="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(8,'Manju club','Vidhyagiri',9,900,false)";
				//String sql8="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(9,'Abhi club','Vidhyagiri',1,600,true)";
				String sql9="insert into club(c_id,c_name,c_location,c_bouncers,c_entryFee,c_isActive) values(10,'Sai club','Vidhyagiri',6,700,false)";
				Statement statement=mysql.createStatement();
				//statement.execute(sql);
				//System.out.println(sql);
				//statement.execute(sql1);
				//System.out.println(sql1);
				statement.execute(sql9);
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
