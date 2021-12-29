package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.ClubDAO;
import com.xworkz.jdbc.dto.ClubDTO;

public class JDBCDTOStarter {

	public static void main(String[] args) {
		ClubDTO clubDTO=new ClubDTO(11,"Pranu club","btmlayout",10,1000d,true);
		ClubDAO clubDAO=new ClubDAO();
		//clubDAO.save(clubDTO);
		
		boolean delete=clubDAO.deleteById(10);
		System.out.println(delete);
	}

}
