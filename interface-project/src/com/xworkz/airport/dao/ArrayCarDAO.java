package com.xworkz.airport.dao;

public class ArrayCarDAO implements CarDAO {
	private CarDTO[] dtos = new CarDTO[100];;
	private int counter=0;
	
	public void saveCar(CarDTO carDTOs1) {
		System.out.println("invoked saveCar ");

		if (this.counter < this.dtos.length && this.counter >= 0) {
			this.dtos[this.counter++] = carDTOs1;

		} else {
			System.out.println("Cannot saveAirPort the dtos :".concat(String.valueOf(this.counter)));
		}
	}
	
	@Override
	public CarDTO findByName(String name) {
		System.out.println("invoked finding name");
		return null;
	}
	
	@Override
	public boolean save(CarDTO carDTO) {
		
		return false;
	}

}
