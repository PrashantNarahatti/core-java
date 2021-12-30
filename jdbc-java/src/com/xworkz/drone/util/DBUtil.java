package com.xworkz.drone.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.drone.constant.DBConstant;

public class DBUtil {

	public static Connection createConnection() {
		Connection connection;
		try {
			connection = DriverManager.getConnection(DBConstant.MYSQL_URL, DBConstant.MYSQL_NAME,
					DBConstant.MYSQL_PASSWORD);
			return connection;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(Connection connection) {
		if (connection != null)
			try {

				connection.close();
				System.out.println("Closed the resource");

			} catch (SQLException e) {

				e.printStackTrace();
			}

	}
}