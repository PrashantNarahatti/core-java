package com.xworkz.dto;

public class BraceletDTO {
	
  private float price;
  private String colour;
  private String material;
  private boolean gemUsed;
  private boolean gifted;
  
  public BraceletDTO()
  {
	  System.out.println("BraceletDTO no arg invoke const");
	  
  }
  
public BraceletDTO(float price, String colour, String material, boolean gemUsed, boolean gifted) {
	super();
	this.price = price;
	this.colour = colour;
	this.material = material;
	this.gemUsed = gemUsed;
	this.gifted = gifted;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public boolean isGemUsed() {
	return gemUsed;
}

public void setGemUsed(boolean gemUsed) {
	this.gemUsed = gemUsed;
}

public boolean isGifted() {
	return gifted;
}

public void setGifted(boolean gifted) {
	this.gifted = gifted;
}
  

  

}
