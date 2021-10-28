package com.xworkz.dto;

public class WalletDTO {
	private String companyName;
	private String material;
	private Integer totalCompartments;
	private float price;
	private boolean coinCompartment;

	public WalletDTO() {
		System.out.println("invoked WalletDTO no args const");
	}

	public WalletDTO(String companyName, String material, Integer totalCompartments, float price,
			boolean coinCompartment) {
		super();
		this.companyName = companyName;
		this.material = material;
		this.totalCompartments = totalCompartments;
		this.price = price;
		this.coinCompartment = coinCompartment;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Integer getTotalCompartments() {
		return totalCompartments;
	}

	public void setTotalCompartments(Integer totalCompartments) {
		this.totalCompartments = totalCompartments;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isCoinCompartment() {
		return coinCompartment;
	}

	public void setCoinCompartment(boolean coinCompartment) {
		this.coinCompartment = coinCompartment;
	}

}
