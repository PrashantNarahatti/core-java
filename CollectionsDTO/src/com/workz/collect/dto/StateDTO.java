package com.workz.collect.dto;

public class StateDTO {
	private String name;
	private int noOfDistricts;
	private int noOfTaluks;
	private String CMName;
	private String capitalCity;

	public StateDTO() {
		System.out.println("invoked no args const");
	}

	public StateDTO(String name, int noOfDistricts, int noOfTaluks, String cMName, String capitalCity) {
		super();
		this.name = name;
		this.noOfDistricts = noOfDistricts;
		this.noOfTaluks = noOfTaluks;
		CMName = cMName;
		this.capitalCity = capitalCity;
	}

	@Override
	public String toString() {
		return "StateDTO [name=" + name + ", noOfDistricts=" + noOfDistricts + ", noOfTaluks=" + noOfTaluks
				+ ", CMName=" + CMName + ", capitalCity=" + capitalCity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfDistricts() {
		return noOfDistricts;
	}

	public void setNoOfDistricts(int noOfDistricts) {
		this.noOfDistricts = noOfDistricts;
	}

	public int getNoOfTaluks() {
		return noOfTaluks;
	}

	public void setNoOfTaluks(int noOfTaluks) {
		this.noOfTaluks = noOfTaluks;
	}

	public String getCMName() {
		return CMName;
	}

	public void setCMName(String cMName) {
		CMName = cMName;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

}
