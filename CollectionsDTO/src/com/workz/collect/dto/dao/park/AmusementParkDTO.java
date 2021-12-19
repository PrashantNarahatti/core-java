package com.workz.collect.dto.dao.park;

public class AmusementParkDTO {

	private String name;
	private double entryFees;
	private boolean restaurant;
	private boolean boating;

	public AmusementParkDTO() {
		System.out.println("invoked no-args const");
	}

	public AmusementParkDTO(String name, double entryFees, boolean restaurant, boolean boating) {
		super();
		this.name = name;
		this.entryFees = entryFees;
		this.restaurant = restaurant;
		this.boating = boating;
	}

	@Override
	public String toString() {
		return "AmusementParkDTO [name=" + name + ", entryFees=" + entryFees + ", restaurant=" + restaurant
				+ ", boating=" + boating + ", getName()=" + getName() + ", getEntryFees()=" + getEntryFees()
				+ ", isRestaurant()=" + isRestaurant() + ", isBoating()=" + isBoating() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(double entryFees) {
		this.entryFees = entryFees;
	}

	public boolean isRestaurant() {
		return restaurant;
	}

	public void setRestaurant(boolean restaurant) {
		this.restaurant = restaurant;
	}

	public boolean isBoating() {
		return boating;
	}

	public void setBoating(boolean boating) {
		this.boating = boating;
	}

}
