package com.xworkz.airport.dao;

public class AirPortDTO {
	private String airPortId;
	private String name;
	private String location;
	private String type;

	public AirPortDTO() {
		System.out.println("invoked AirPortDTO  no args const");
	}

	public AirPortDTO(String airPortId, String name, String location, String type) {
		super();
		this.airPortId = airPortId;
		this.name = name;
		this.location = location;
		this.type = type;
	}

	public String getAirPortId() {
		return airPortId;
	}

	public void setAirPortId(String airPortId) {
		this.airPortId = airPortId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
