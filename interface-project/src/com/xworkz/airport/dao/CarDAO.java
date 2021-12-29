package com.xworkz.airport.dao;

public interface CarDAO {
	
	boolean save(CarDTO carDTO);
	CarDTO findByName(String name);
}
