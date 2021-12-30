package com.xworkz.drone;

import com.xworkz.drone.dao.FestivalDAO;
import com.xworkz.drone.dto.FestivalDTO;

public class FestivalScammer {

	public static void main(String[] args) {
		FestivalDTO festivalDTO1 = new FestivalDTO(1, "Ugadi", "13 March 2021", "Karnataka");
		FestivalDTO festivalDTO2 = new FestivalDTO(2, "Ganesha Chaturthi", "05 August 2021", "Karnataka");
		FestivalDTO festivalDTO3 = new FestivalDTO(3, "Dasara", "10 November 2021", "Karnataka");
		FestivalDTO festivalDTO4 = new FestivalDTO(4, "Sankranti", "15 January 2021", "Karnataka");

		FestivalDAO festivalDAO = new FestivalDAO();
		// festivalDAO.save(festivalDTO1);
		// festivalDAO.save(festivalDTO2);
		// festivalDAO.save(festivalDTO3);
		// festivalDAO.save(festivalDTO4);

		// boolean delete=festivalDAO.deleteById(3);
		// System.out.println(delete);

		// festivalDAO.readOperationById(1);
		// festivalDAO.displayAll();
		festivalDAO.displayTotalRows();

	}
}
