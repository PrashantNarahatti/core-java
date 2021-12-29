package com.xworkz.jdbc.dto;

import java.io.Serializable;

public class ClubDTO implements Serializable {
	private int id;
	private String name;
	private String location;
	private int bouncers;
	private double entryFee;
	private boolean isActive;

	public ClubDTO() {
		System.out.println("invoked no args const");
	}

	public ClubDTO(int id, String name, String location, int bouncers, double entryFee, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.bouncers = bouncers;
		this.entryFee = entryFee;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "ClubDTO [id=" + id + ", name=" + name + ", location=" + location + ", bouncers=" + bouncers
				+ ", entryFee=" + entryFee + ", isActive=" + isActive + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getBouncers() {
		return bouncers;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public boolean isActive() {
		return isActive;
	}

}
