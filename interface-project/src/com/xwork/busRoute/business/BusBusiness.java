package com.xwork.busRoute.business;

import com.xworkz.busRoute.BusRouteDAO;
import com.xworkz.busRoute.BusRouteDTO;

public class BusBusiness {
	BusRouteDAO dao;

	private BusRouteDTO[] busRouteDTOs = new BusRouteDTO[1000];
	private int octopus = 0;

	public void saveCart(BusRouteDTO dto) {
		System.out.println(" save BusRouteDTO ");

		if (this.octopus < this.busRouteDTOs.length && this.octopus >= 0) {
			this.busRouteDTOs[this.octopus++] = dto;

		} else {
			System.out.println("Cannot save the busRouteDTOs :".concat(String.valueOf(this.octopus)));
		}
	}

	public void findBusRouteByName(BusRouteDTO dto) {
		System.out.println("invoked findBusRouteByName");
		System.out.println("dto passed");

		for (int note = 0; note < this.busRouteDTOs.length; note++) {
			BusRouteDTO ref = this.busRouteDTOs[note];
			if (ref != null) {
				System.out.println("ref in note is not null: ".concat(String.valueOf(note)));
				String temp = ref.getDiverName();
				System.out.println(temp);
				if (dto.equals(dto)) {
					System.out.println("Cart name  found");

				}

			}
		}

	}

	public void displayBusRoute() {
		System.out.println("invoked  displayBusRoute ");
	}

}



