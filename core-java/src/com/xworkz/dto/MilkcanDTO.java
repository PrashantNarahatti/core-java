package com.xworkz.dto;

public class MilkcanDTO {
	private float quantity;
	private String shape;
	private String colour;
	private float price;
	private String quality;

	public MilkcanDTO() {
		System.out.println("invoked MilkcanDTO no args const");
	}

	public MilkcanDTO(float quantity, String shape, String colour, float price, String quality) {
		super();
		this.quantity = quantity;
		this.shape = shape;
		this.colour = colour;
		this.price = price;
		this.quality = quality;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

}
