package com.xworkz.rules.voting;

public class IndianCitizen implements VotingRule,TraffiicRule,MarriageRule{

	@Override
	public int valideAge() {
		System.out.println("invoked valideAge");
		return 18;
	}

	@Override
	public String validId() {
		System.out.println("invoked validId");
		return "YCV0164822";
	}

	@Override
	public boolean validAge(char gender,int age) {
		System.out.println("invoked validAge");
		return false;
	}

	@Override
	public boolean validLicence() {
		System.out.println("invoked validLicence");
		return false;
	}

	@Override
	public String licenseNo() {
		// TODO Auto-generated method stub
		return "DL-0420110149xxxx";
	}

	@Override
	public boolean validInsurance() {
		System.out.println("invoked validInsurance");
		return false;
	} 
    
	private String name="Pacchu";
	private String address="BGK";
	
	public void displayNameAndAddressDetails() {
		System.out.println("invoked displayNameAndAddressDetails");
	     
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

