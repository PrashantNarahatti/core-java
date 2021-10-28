package com.xworkz.dp.dao;

import com.xworkz.dto.MilkcanDTO;
import com.xworkz.dto.MilkcanDTO;

public class MilkcanDAO {
	private MilkcanDTO[] milkcanDTOs = new MilkcanDTO[100];
	private int counter = 0;

	public void create(MilkcanDTO dto) {
		System.out.println("create milkcanDTOs cost");

		if (this.counter < this.milkcanDTOs.length && this.counter >= 0) {
			this.milkcanDTOs[this.counter++] = dto;

		} else {
			System.out.println("Cannot create the milkcanDTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public void create(MilkcanDTO dto, int index) {
		System.out.println("create milkcanDTOs dto and int cost:".concat(dto.getColour()));
		if (index >= 0 && this.counter < this.milkcanDTOs.length && this.counter >= 0 && dto != null) {
			this.milkcanDTOs[this.counter++] = dto;
			System.out.println("create milkcanDTOs dto and int cost:".concat(String.valueOf(index)));
		} else {
			System.out.println("Cannot create the milkcanDTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied:".concat(String.valueOf(counter)));
		return counter;
	}

	public boolean matchMilkcanByColour(String colour) {
		System.out.println("invoked matchMilkcanByColour");
		System.out.println("colour passed: ".concat(colour));

		for (int papa = 0; papa < this.milkcanDTOs.length; papa++) {
			MilkcanDTO ref = this.milkcanDTOs[papa];
			if (ref != null) {
				System.out.println("ref in index is not null: ".concat(String.valueOf(papa)));
				String tempName = ref.getColour();
				System.out.println("matching: ".concat(tempName));
				if (colour.equals(tempName)) {
					System.out.println("colour found");
					return true;
				}

			}
		}
		return false;
	}
}
