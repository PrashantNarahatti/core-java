package com.workz.collect.list.loop.map;

public class AddressDTO {
	private int id;
	private int doorNo;
	private String street;
	private String city;
	private String pincode;
	
	public AddressDTO() {
		System.out.println("invoked no args const");
	}

	public AddressDTO(int id, int doorNo, String street, String city, String pincode) {
		super();
		this.id = id;
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressDTO [id=" + id + ", doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", pincode="
				+ pincode + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	

}
