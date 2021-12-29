package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.CityDAO;
import com.xworkz.jdbc.dto.CityDTO;

public class CityScammer {

	public static void main(String[] args) {
		CityDTO cityDTO1 = new CityDTO(1, "Bagalkot", "111933", "Durga Temple");
		CityDTO cityDTO2 = new CityDTO(2, "Koppal", "468448", "Gavimath");
		CityDTO cityDTO3 = new CityDTO(3, "Gadag", "367258", "Doddabasappa Temple");
		CityDTO cityDTO4 = new CityDTO(4, "Laxmeshwar", "898", "Someshwara Temple");

		CityDAO cityDAO = new CityDAO();
	//	cityDAO.save(cityDTO1);
	//	cityDAO.save(cityDTO2);
	//	cityDAO.save(cityDTO3);
	//	cityDAO.save(cityDTO4);

		boolean delete=cityDAO.deleteById(3);
		 System.out.println(delete); 

	}

}
