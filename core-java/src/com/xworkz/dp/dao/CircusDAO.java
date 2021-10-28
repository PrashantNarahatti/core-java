package com.xworkz.dp.dao;

import com.xworkz.dto.CircusDTO;
import com.xworkz.dto.CircusDTO;

public class CircusDAO {
	private CircusDTO[] circusDTOs = new CircusDTO[100];
	private int counter = 0;

	public void create(CircusDTO dto) {
		System.out.println("create circusDTOs cost");

		if (this.counter < this.circusDTOs.length && this.counter >= 0) {
			this.circusDTOs[this.counter++] = dto;

		} else {
			System.out.println("Cannot create the circusDTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public void create(CircusDTO dto, int index) {
		System.out.println("create circusDTOs dto and int cost:".concat(dto.getOwner()));
		if (index >= 0 && this.counter < this.circusDTOs.length && this.counter >= 0 && dto != null) {
			this.circusDTOs[this.counter++] = dto;
			System.out.println("create circusDTOs dto and int cost:".concat(String.valueOf(index)));
		} else {
			System.out.println("Cannot create the circusDTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied:".concat(String.valueOf(counter)));
		return counter;
	}

	public boolean matchCircusByOwner(String owner) {
		System.out.println("invoked matchCircusByOwner");
		System.out.println("owner passed: ".concat(owner));

		for (int papa = 0; papa < this.circusDTOs.length; papa++) {
			CircusDTO ref = this.circusDTOs[papa];
			if (ref != null) {
				System.out.println("ref in index is not null: ".concat(String.valueOf(papa)));
				String tempName = ref.getOwner();
				System.out.println("matching: ".concat(tempName));
				if (owner.equals(tempName)) {
					System.out.println("owner found");
					return true;
				}

			}
		}
		return false;
	}

}
