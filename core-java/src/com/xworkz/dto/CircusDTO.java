package com.xworkz.dto;

public class CircusDTO {
	private String owner;
	private Integer ticketPrice;
	private Integer noOfAnimals;
	private Integer noOfShows;
	private String duration;

	public CircusDTO() {
		System.out.println("invoked CircusDTO no args const");
	}

	public CircusDTO(String owner, Integer ticketPrice, Integer noOfAnimals, Integer noOfShows, String duration) {
		super();
		this.owner = owner;
		this.ticketPrice = ticketPrice;
		this.noOfAnimals = noOfAnimals;
		this.noOfShows = noOfShows;
		this.duration = duration;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Integer getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Integer getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(Integer noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public Integer getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(Integer noOfShows) {
		this.noOfShows = noOfShows;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
