package com.xworkz.dp.dao;

import com.xworkz.dto.TimerDTO;
import com.xworkz.dto.TimerDTO;

public class TimerDAO {
	private TimerDTO[] timerDTOs = new TimerDTO[100];
	private int counter = 0;

	public void create(TimerDTO dto) {
		System.out.println("create timerDTOs cost");

		if (this.counter < this.timerDTOs.length && this.counter >= 0) {
			this.timerDTOs[this.counter++] = dto;

		} else {
			System.out.println("Cannot create the timerDTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public void create(TimerDTO dto, int index) {
		System.out.println("create timerDTOs dto and int cost:".concat(dto.getBrand()));
		if (index >= 0 && this.counter < this.timerDTOs.length && this.counter >= 0 && dto != null) {
			this.timerDTOs[this.counter++] = dto;
			System.out.println("create milkcanDTOs dto and int cost:".concat(String.valueOf(index)));
		} else {
			System.out.println("Cannot create the milkcanDTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied:".concat(String.valueOf(counter)));
		return counter;
	}

	public boolean matchTimerByBrand(String brand) {
		System.out.println("invoked matchTimerByBrand");
		System.out.println("brand passed: ".concat(brand));

		for (int pacchu = 0; pacchu < this.timerDTOs.length; pacchu++) {
			TimerDTO ref = this.timerDTOs[pacchu];
			if (ref != null) {
				System.out.println("ref in index is not null: ".concat(String.valueOf(pacchu)));
				String tempName = ref.getBrand();
				System.out.println("matching: ".concat(tempName));
				if (brand.equals(tempName)) {
					System.out.println("brand found");
					return true;
				}

			}
		}
		return false;
	}

}
