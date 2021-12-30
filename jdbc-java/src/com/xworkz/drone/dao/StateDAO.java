package com.xworkz.drone.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.StateConstant;
import com.xworkz.jdbc.dto.StateDTO;
import com.xworkz.jdbc.utils.DBUtil;

public class StateDAO {
	public boolean save(StateDTO stateDTO) {
		System.out.println("saving...");
		Connection mysql = null;

		mysql = DBUtil.createConnection();

		try {

			String sql = "insert into State_details values(?,?,?,?)";
			// java.sql.Statement statement=mysql.createStatement();
			PreparedStatement statement = mysql.prepareStatement(sql);
			statement.setObject(1, stateDTO.getId());
			statement.setObject(2, stateDTO.getName());
			statement.setObject(3, stateDTO.getCode());
			statement.setObject(4, stateDTO.getCapital());
			int rowsAffected = statement.executeUpdate();
			System.out.println(sql);
			System.out.println("Formatted output : " + rowsAffected);
			if (rowsAffected == 1) {
				return true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(mysql);

		}
		return false;

	}

	public boolean deleteById(int id) {
		Connection mysql = DBUtil.createConnection();

		try {

			String sql = "delete from State_details where s_id=?";
			PreparedStatement statement = mysql.prepareStatement(sql);
			statement.setObject(1, id);
			int rowsAffected = statement.executeUpdate();
			System.out.println("Formatted output : " + rowsAffected);
			if (rowsAffected == 1) {
				return true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBUtil.closeConnection(mysql);
		}

		return false;

	}

	public void readOperationById(int id) {
		Connection mysql = DBUtil.createConnection();

		try {

			String sql = "select * from State_details where s_id=?";
			PreparedStatement statement = mysql.prepareStatement(sql);
			statement.setObject(1, id);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Object s_id = result.getObject(1);
				System.out.println("s_id- " + id);
				Object s_name = result.getObject(2);
				System.out.println("s_name - " + s_name);
				Object s_code = result.getObject(3);
				System.out.println("s_code - " + s_code);
				Object s_capital = result.getObject(4);
				System.out.println("s_capital -" + s_capital);

			}
			// stat.setObject(1, id);
			// int rowsAffected=stat.executeUpdate();
			// System.out.println("Formatted output : "+rowsAffected);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			DBUtil.closeConnection(mysql);
		}

	}

	public void displayAll() {
		Connection mysql = DBUtil.createConnection();

		try {

			String sql = "select * from state_details";
			PreparedStatement statement = mysql.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Object s_id = result.getObject(1);
				Object s_name = result.getObject(2);
				Object s_code = result.getObject(3);
				Object s_capital = result.getObject(4);
				System.out.println("s_id- " + s_id + " " + "s_name- " + s_name + " " + "s_code- " + s_code + " "
						+ "s_capital- " + s_capital);
			}
			// stat.setObject(1, id);
			// int rowsAffected=stat.executeUpdate();
			// System.out.println("Formatted output : "+rowsAffected);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBUtil.closeConnection(mysql);
		}

	}

	public void displayTotalRows() {
		Connection mysql = DBUtil.createConnection();

		try {

			String sql = "select count(*) from state_details";
			PreparedStatement statement = mysql.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			result.next();
			int count = result.getInt(1);
			System.out.println("No of rows in State_details table - " + count);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBUtil.closeConnection(mysql);
		}

	}

}