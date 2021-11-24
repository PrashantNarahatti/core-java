package com.xworkz.airport;

import com.xworkz.airport.dao.AirPortDTO;
import com.xworkz.airport.dao.ArrayAirPortDAO;

public class AirPortStarter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirPortDTO airPortDTOs1 = new AirPortDTO("IN1037865", "Pacchu", "Hubli", "National");
		ArrayAirPortDAO dto1 = new ArrayAirPortDAO();
		dto1.save(airPortDTOs1);

		dto1.saveAirPort(new AirPortDTO("IN10943578", "Pranu", "Bengalore", "Regional"), 3);

		AirPortDTO ref = dto1.findByName("Pacchu");
		System.out.println(ref);

		ArrayAirPortDAO arrayAirPortDAO = new ArrayAirPortDAO();
		System.out.println(arrayAirPortDAO.save(airPortDTOs1));
		System.out.println(arrayAirPortDAO.findByName("Pacchu"));
		arrayAirPortDAO.displayAllAirPortDetails();

	}
}
