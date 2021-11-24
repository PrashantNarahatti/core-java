package com.xworkz.busRoute;


public class ArrayBusRouteDAO implements BusRouteDAO {

	private BusRouteDTO[] dtos = new BusRouteDTO[100];;
	private int counter;

	@Override
	public boolean save(BusRouteDTO busRouteDTO) {
		System.out.println("invoked save");
		return true;
	}

	@Override
	public BusRouteDTO findByName(String name) {
		System.out.println("invoked finding name");

		return null;
	}

	public void saveBusRoute(BusRouteDTO busRouteDTO, int i) {
		System.out.println("save busRouteDTO dto and int cost:".concat(busRouteDTO.getDiverName()));
		if (i >= 0 && this.counter < this.dtos.length && this.counter >= 0 && dtos != null) {
			this.dtos[this.counter++] = busRouteDTO;
			System.out.println("save busRouteDTO dto and int cost:".concat(String.valueOf(i)));
		} else {
			System.out.println("Cannot save the busRouteDTO :".concat(String.valueOf(this.counter)));
		}
	}

	public void saveBusRoute(BusRouteDTO busRouteDTOs1) {
		System.out.println("invoked saveBusRoute ");

		if (this.counter < this.dtos.length && this.counter >= 0) {
			this.dtos[this.counter++] = busRouteDTOs1;

		} else {
			System.out.println("Cannot saveBusRoute the dtos :".concat(String.valueOf(this.counter)));
		}
	}

	@Override
	public void displayAllBusDetails() {
		System.out.println("invoked displayAllBusDetails ");
	} 

}
