package com.xworkz.dp.dao;

import com.xworkz.dto.DoctorDTO;
import com.xworkz.dto.IplDTO;
import com.xworkz.dto.DoctorDTO;

public class DoctorDAO {
	private DoctorDTO[] doctorDTOs = new DoctorDTO[999];
	private int octopus = 0;

	public void create(DoctorDTO dto) {
		System.out.println("create doctorDTOs cost");

		if (this.octopus < this.doctorDTOs.length && this.octopus >= 0) {
			this.doctorDTOs[this.octopus++] = dto;

		} else {
			System.out.println("Cannot create the doctorDTOs :".concat(String.valueOf(this.octopus)));
		}
	}

	public void create(DoctorDTO dto, int index) {
		System.out.println("create doctorDTOs dto and int cost:".concat(dto.getName()));
		if (index >= 0 && this.octopus < this.doctorDTOs.length && this.octopus >= 0 && dto != null) {
			this.doctorDTOs[this.octopus++] = dto;
			System.out.println("create doctorDTOs dto and int cost:".concat(String.valueOf(index)));
		} else {
			System.out.println("Cannot create the doctorDTOs :".concat(String.valueOf(this.octopus)));
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied".concat(String.valueOf(octopus)));
		return octopus;
	}

	public boolean matchDoctorByName(String name) {
		System.out.println("invoked matchDoctorByName");
		System.out.println("name passed: ".concat(name));

		for (int deathNote = 0; deathNote < this.doctorDTOs.length; deathNote++) {
			DoctorDTO ref = this.doctorDTOs[deathNote];
			if (ref != null) {
				System.out.println("ref in index is not null: ".concat(String.valueOf(deathNote)));
				String tempName = ref.getName();
				System.out.println("matching: ".concat(tempName));
				if (name.equals(tempName)) {
					System.out.println("name found");
					return true;
				}

			}
		}
		return false;
	}

}
