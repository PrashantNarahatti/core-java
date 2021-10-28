package com.xworkz.dto;

public class MovieDTO {
	private String name;
	private String director;
	private String actor;
	private Integer rating;
	private String producer;

	public MovieDTO() {
		System.out.println("invoked MovieDTO no args const ");
	}

	public MovieDTO(String name, String director, String actor, Integer rating, String producer) {
		super();
		this.name = name;
		this.director = director;
		this.actor = actor;
		this.rating = rating;
		this.producer = producer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

}
