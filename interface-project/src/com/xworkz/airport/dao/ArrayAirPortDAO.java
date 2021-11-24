package com.xworkz.airport.dao;

public class ArrayAirPortDAO implements AirPortDAO {

	private AirPortDTO[] dtos = new AirPortDTO[100];;
	private int counter;

	@Override
	public boolean save(AirPortDTO airPortDTO) {
		System.out.println("invoked save");
		return true;
	}

	@Override
	public AirPortDTO findByName(String name) {
		System.out.println("invoked finding name");

		return null;
	}

	public void saveAirPort(AirPortDTO airPortDTO, int i) {
		System.out.println("save airPortDTO dto and int cost:".concat(airPortDTO.getName()));
		if (i >= 0 && this.counter < this.dtos.length && this.counter >= 0 && dtos != null) {
			this.dtos[this.counter++] = airPortDTO;
			System.out.println("save airPortDTO dto and int cost:".concat(String.valueOf(i)));
		} else {
			System.out.println("Cannot save the airPortDTO :".concat(String.valueOf(this.counter)));
		}
	}

	public void saveAirPort(AirPortDTO airPortDTOs1) {
		System.out.println("invoked saveAirPort ");

		if (this.counter < this.dtos.length && this.counter >= 0) {
			this.dtos[this.counter++] = airPortDTOs1;

		} else {
			System.out.println("Cannot saveAirPort the dtos :".concat(String.valueOf(this.counter)));
		}
	}

	@Override
	public void displayAllAirPortDetails() {
		System.out.println("invoked displayAllAirPortDetails ");
	}

}
