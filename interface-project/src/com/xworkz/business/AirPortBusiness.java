package com.xworkz.business;

import com.xworkz.airport.dao.AirPortDAO;
import com.xworkz.airport.dao.AirPortDTO;

public class AirPortBusiness {
	AirPortDAO dao;

	private AirPortDTO[] airPortDTOs = new AirPortDTO[1000];
	private int octopus = 0;

	public void saveAirPort(AirPortDTO dto) {
		System.out.println(" save saveAirPort ");

		if (this.octopus < this.airPortDTOs.length && this.octopus >= 0) {
			this.airPortDTOs[this.octopus++] = dto;

		} else {
			System.out.println("Cannot save the airPortDTOs :".concat(String.valueOf(this.octopus)));
		}
	}

	public void findAirPortByName(AirPortDTO dto) {
		System.out.println("invoked findAirPortByName");
		System.out.println("dto passed");

		for (int note = 0; note < this.airPortDTOs.length; note++) {
			AirPortDTO ref = this.airPortDTOs[note];
			if (ref != null) {
				System.out.println("ref in note is not null: ".concat(String.valueOf(note)));
				String temp = ref.getName();
				System.out.println(temp);
				if (dto.equals(dto)) {
					System.out.println("Cart name  found");

				}

			}
		}

	}

	public void displayAirport() {
		System.out.println("invoked  displayAirport ");
	}

}
