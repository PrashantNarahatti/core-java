package com.xworkz.airport;

import com.xworkz.airport.dao.ArrayCarDAO;
import com.xworkz.airport.dao.CarDTO;

public class CarStarter {

	public static void main(String[] args) {
		CarDTO carDTOs1 = new CarDTO("i20","Hatchbacks");
		ArrayCarDAO dto1 = new ArrayCarDAO();
		dto1.save(carDTOs1);

		dto1.saveCar(new CarDTO("Sports Car","Hot hatch"));

		
		CarDTO ref = dto1.findByName("i20");
		System.out.println(ref);
	}

}
