package com.xworkz.busRoute;

public class BusRouteDTO {
	private String busId;
	private String startPoint;
	private String destination;
	private String diverName;
	
	public BusRouteDTO() {
		System.out.println("invoked BusRouteDTO no args const");

}

	public BusRouteDTO(String busId, String startPoint, String destination, String diverName) {
		super();
		this.busId = busId;
		this.startPoint = startPoint;
		this.destination = destination;
		this.diverName = diverName;
	}

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDiverName() {
		return diverName;
	}

	public void setDiverName(String diverName) {
		this.diverName = diverName;
	}
	
}
