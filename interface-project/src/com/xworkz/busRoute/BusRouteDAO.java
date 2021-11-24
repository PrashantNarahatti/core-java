package com.xworkz.busRoute;

public interface BusRouteDAO {
	boolean save(BusRouteDTO BusRouteDTO);

	BusRouteDTO findByName(String name);

	void displayAllBusDetails();

}
