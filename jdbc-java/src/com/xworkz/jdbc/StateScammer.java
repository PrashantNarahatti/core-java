package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.StateDAO;
import com.xworkz.jdbc.dto.StateDTO;

public class StateScammer {

	public static void main(String[] args) {
		StateDTO stateDTO1 = new StateDTO(1, "Karnataka",29,"Bangalore");
		StateDTO stateDTO2 = new StateDTO(2, "Jammu Kashamir",19,"Shrinagar");
		StateDTO stateDTO3 = new StateDTO(3, "Punjab",21,"Chandigarh");
		StateDTO stateDTO4 = new StateDTO(4, "Haryana",24,"Chandigarh");

		StateDAO stateDAO = new StateDAO();
		//stateDAO.save(stateDTO1);
		//stateDAO.save(stateDTO2);
		//stateDAO.save(stateDTO3);
		//stateDAO.save(stateDTO4);

		boolean delete=stateDAO.deleteById(3);
		System.out.println(delete); 

	}

}
