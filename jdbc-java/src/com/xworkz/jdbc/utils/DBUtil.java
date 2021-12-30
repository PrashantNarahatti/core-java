package com.xworkz.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.StateConstant;

public class DBUtil {

	public static Connection createConnection() {
		Connection connection;
		try {
			connection = DriverManager.getConnection(StateConstant.MYSQL_URL, StateConstant.MYSQL_NAME,
					StateConstant.MYSQL_PASSWORD);
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