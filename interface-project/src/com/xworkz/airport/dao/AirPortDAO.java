package com.xworkz.airport.dao;

public interface AirPortDAO {
	boolean save(AirPortDTO airPortDTO);

	AirPortDTO findByName(String name);

	void displayAllAirPortDetails();

}
