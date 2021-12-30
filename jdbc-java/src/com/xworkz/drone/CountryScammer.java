package com.xworkz.drone;

import com.xworkz.drone.dao.CountryDAO;
import com.xworkz.drone.dto.CountryDTO;

public class CountryScammer {

	public static void main(String[] args) {
		CountryDTO countryDTO1 = new CountryDTO(1, "India", +91, "Asia");
		CountryDTO countryDTO2 = new CountryDTO(2, "Sri Lanka", +94, "Asia");
		CountryDTO countryDTO3 = new CountryDTO(3, "South Africa", +27, "Africa");
		CountryDTO countryDTO4 = new CountryDTO(4, "West Indies", +29, "North America");

		CountryDAO countryDAO = new CountryDAO();
		// countryDAO.save(countryDTO1);
		// countryDAO.save(countryDTO2);
		// countryDAO.save(countryDTO3);
		// countryDAO.save(countryDTO4);

		// boolean delete=countryDAO.deleteById(3);
		// System.out.println(delete);

		// countryDAO.readOperationById(1);
		// countryDAO.displayAll();
		countryDAO.displayTotalRows();
	}
}
