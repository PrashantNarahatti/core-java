package com.workz.collect.dto;

public class PalaceDTO {
	private String name;
	private String location;
	private String openTime;
	private String closeTime;
	private int entryFee;
	
	public PalaceDTO() {
		System.out.println("invoked no args const");
			}

	public PalaceDTO(String name, String location, String openTime, String closeTime, int entryFee) {
		super();
		this.name = name;
		this.location = location;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.entryFee = entryFee;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", openTime=" + openTime + ", closeTime="
				+ closeTime + ", entryFee=" + entryFee + "]";
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

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public int getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(int entryFee) {
		this.entryFee = entryFee;
	}
	

}
