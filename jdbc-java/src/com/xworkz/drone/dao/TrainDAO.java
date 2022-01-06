package com.xworkz.drone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.xworkz.drone.constant.TrainConstant;
import com.xworkz.drone.dto.TrainDTO;
import com.xworkz.drone.util.DBaseUtil;

public class TrainDAO {
	public boolean save(TrainDTO trainDTO) {
		System.out.println("saving...");
		Connection mysql = null;
		try {
			Class.forName(TrainConstant.DRIVER);
			mysql = DBaseUtil.createConnection();

			String sql = "insert into train_details values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = mysql.prepareStatement(sql);
			pstmt.setObject(1, trainDTO.getId());
			pstmt.setObject(2, trainDTO.getTrainNo());
			pstmt.setObject(3, trainDTO.getBoarding());
			pstmt.setObject(4, trainDTO.getDestination());
			pstmt.setObject(5, trainDTO.getSeatNo());
			pstmt.setObject(6, trainDTO.getPrice());
			pstmt.setObject(7, trainDTO.getClassType());
			pstmt.setObject(8, trainDTO.getName());
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Formated output :" + rowsAffected);

			if (rowsAffected == 1) {
				return true;
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBaseUtil.closeConnection(mysql);
		}

		return false;
	}

	public boolean deleteByTrainNo(int trainNo) {

		Connection mysql = null;
		try {
			Class.forName(TrainConstant.DRIVER);
			mysql = DBaseUtil.createConnection();

			String sql = "delete from train_details where t_trainNo=?";
			PreparedStatement pstmt = mysql.prepareStatement(sql);
			pstmt.setObject(1, trainNo);
			int rowsAffected = pstmt.executeUpdate(sql);
			System.out.println("Formated output :" + rowsAffected);
			if (rowsAffected == 1)
				return true;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBaseUtil.closeConnection(mysql);
		}
		return false;
	}

	public void displayById(int id) {
		Connection mysql = null;
		try {
			mysql = DBaseUtil.createConnection();

			String sql = "SELECT * FROM train_details where t_id=?";
			PreparedStatement stat = mysql.prepareStatement(sql);
			stat.setObject(1, id);
			ResultSet rs = stat.executeQuery();
			while (rs.next()) {
				Object t_id = rs.getObject(1);
				System.out.println("id- " + t_id);
				Object t_trainNo = rs.getObject(2);
				System.out.println("trainNo - " + t_trainNo);
				Object t_boarding = rs.getObject(3);
				System.out.println("boarding- " + t_boarding);
				Object t_destination = rs.getObject(4);
				System.out.println("destination -" + t_destination);
				Object t_seatNo = rs.getObject(5);
				System.out.println("seatNo -" + t_seatNo);
				Object t_price = rs.getObject(6);
				System.out.println("price -" + t_price);
				Object t_classType = rs.getObject(7);
				System.out.println("classType -" + t_classType);
				Object t_name = rs.getObject(8);
				System.out.println("name -" + t_name);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBaseUtil.closeConnection(mysql);
		}
	}

	public boolean deleteByTrainNoAndT_id(int trainNo, int id) {

		Connection mysql = null;
		try {
			Class.forName(TrainConstant.DRIVER);
			mysql = DBaseUtil.createConnection();

			String sql = "delete from train_details where t_trainNo=? AND t_id=?";
			PreparedStatement pstmt = mysql.prepareStatement(sql);
			pstmt.setObject(1, trainNo, id);
			int rowsAffected = pstmt.executeUpdate(sql);
			System.out.println("Formated output :" + rowsAffected);
			if (rowsAffected == 1)
				return true;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBaseUtil.closeConnection(mysql);
		}
		return false;
	}

	public void getByTrainNo(int trainNo) {
		Connection mysql = null;
		try {
			mysql = DBaseUtil.createConnection();

			String sql = "SELECT * FROM train_details where t_traiNo=?";
			PreparedStatement stat = mysql.prepareStatement(sql);
			stat.setObject(1, trainNo);
			ResultSet rs = stat.executeQuery();
			while (rs.next()) {
				Object t_id = rs.getObject(1);
				System.out.println("id- " + t_id);
				Object t_trainNo = rs.getObject(2);
				System.out.println("trainNo - " + t_trainNo);
				Object t_boarding = rs.getObject(3);
				System.out.println("boarding- " + t_boarding);
				Object t_destination = rs.getObject(4);
				System.out.println("destination -" + t_destination);
				Object t_seatNo = rs.getObject(5);
				System.out.println("seatNo -" + t_seatNo);
				Object t_price = rs.getObject(6);
				System.out.println("price -" + t_price);
				Object t_classType = rs.getObject(7);
				System.out.println("classType -" + t_classType);
				Object t_name = rs.getObject(8);
				System.out.println("name -" + t_name);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBaseUtil.closeConnection(mysql);
		}
	}

	public boolean updateDestinationByTrainNo(String newDest, int trainNo) {
		Connection mysql = null;
		try {
			Class.forName(TrainConstant.DRIVER);
			mysql = DBaseUtil.createConnection();

			String sql = "Update train_details wher t_newDest=? where t_trainNo=?";
			PreparedStatement pstmt = mysql.prepareStatement(sql);
			pstmt.setObject(2, newDest, trainNo);

			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Formated output :" + rowsAffected);
			if (rowsAffected == 1)
				return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				try {
					mysql.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public boolean updateDestinationAndBoardingByTrainNo(String newDest, String newBoarding, int trainNo) {
		Connection mysql = null;
		try {
			Class.forName(TrainConstant.DRIVER);
			mysql = DBaseUtil.createConnection();

			String sql = "Update train_details set destination=? AND boarding=? WHERE t_trainNo=?";
			PreparedStatement pstmt = mysql.prepareStatement(sql);
			pstmt.setObject(1, newDest);
			pstmt.setObject(2, newBoarding);
			pstmt.setObject(3, trainNo);

			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Formated output :" + rowsAffected);
			if (rowsAffected == 1)
				return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				try {
					mysql.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;

	}

	public Collection<TrainDTO> getAll() {
		Connection mysql = null;
		mysql = DBaseUtil.createConnection();
		Collection<TrainDTO> details = new ArrayList<TrainDTO>();
		
		try {
			String sql = "SELECT * FROM train_details";
			PreparedStatement stat = mysql.prepareStatement(sql);
			ResultSet result = stat.executeQuery();
			while (result.next()) {
				TrainDTO dto = new TrainDTO();
				int id = result.getInt(1);
				int trainNo = result.getInt(2);
				String boarding = result.getString(3);
				String destination = result.getString(4);
				int seatNo = result.getInt(5);
				int price = result.getInt(6);
				String classType = result.getString(7);
				String name = result.getString(8);

				dto.setId(id);
				dto.setTrainNo(trainNo);
				dto.setBoarding(boarding);
				dto.setDestination(destination);
				dto.setSeatNo(seatNo);
				dto.setPrice(price);
				dto.setClassType(classType);
				dto.setName(name);

				details.add(dto);

				System.out.println(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			if (mysql != null) {
				try {
					mysql.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}

		return details;
	}

	public Collection<TrainDTO> getAllByBoarding(String boarding) {
		Connection mysql = null;
		Collection<TrainDTO> details = new ArrayList<TrainDTO>();
		TrainDTO dtos = new TrainDTO();
		try {
			mysql = DBaseUtil.createConnection();
			String sql = "SELECT * boarding train_details";
			PreparedStatement pstmt = mysql.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String t_boarding = rs.getString(boarding);

				dtos.setBoarding(t_boarding);
				details.add(dtos);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				try {
					mysql.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return details;

	}

	public Collection<TrainDTO> getAllByDestination(String destination) {
		Connection mysql = null;
		Collection<TrainDTO> details = new ArrayList<TrainDTO>();
		TrainDTO dtos = new TrainDTO();
		try {
			mysql = DBaseUtil.createConnection();
			String sql = "SELECT * destination train_details";
			PreparedStatement pstmt = mysql.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String t_dest = rs.getString(destination);

				dtos.setBoarding(t_dest);
				details.add(dtos);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				try {
					mysql.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return details;

	}

	public int getTotal() {
		Connection mysql = null;

		try {
			mysql = DBaseUtil.createConnection();
			String sql = "SELECT count(*) FROM train_details";
			PreparedStatement pstmt = mysql.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int rows = rs.getInt(1);
				System.out.println("total rows in table is:" + rows);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (mysql != null) {
				try {
					mysql.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;

	}

	public double getMaxPrice() {
		Connection mysql = DBaseUtil.createConnection();
		double maxPrice = 0;

		try {

			String sql = "select max(t_price) from train_details";
			PreparedStatement stat = mysql.prepareStatement(sql);
			ResultSet result = stat.executeQuery();
			while (result.next()) {
				maxPrice = result.getDouble(1);
				System.out.println("MaxPrice= " + maxPrice);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			DBaseUtil.closeConnection(mysql);
		}

		return maxPrice;
	}

	public double getMinPrice() {
		Connection mysql = DBaseUtil.createConnection();
		double minPrice = 0;

		try {

			String sql = "select min(t_price) from train_details";
			PreparedStatement stat = mysql.prepareStatement(sql);
			ResultSet result = stat.executeQuery();
			while (result.next()) {
				minPrice = result.getDouble(1);
				System.out.println("MinPrice= " + minPrice);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			DBaseUtil.closeConnection(mysql);
		}

		return minPrice;
	}
}
