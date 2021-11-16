package com.xworkz.rules.voting;

public class AfricaCitizen implements VotingRule,TraffiicRule,MarriageRule {

	@Override
	public boolean validAge(char gender, int age) {
		System.out.println("invoked validAge");
		return false;
	}

	@Override
	public int valideAge() {
		System.out.println("invoked validAge");
		return 18;
	}

	@Override
	public String validId() {
		System.out.println("invoked validId");
		return "YCV0164811";
	}

	@Override
	public boolean validLicence() {
		System.out.println("invoked validLicence");
		return false;
	}

	@Override
	public String licenseNo() {
		System.out.println("invoked licenseNo");
		return "DL-0420110103xxxx";
	}

	@Override
	public boolean validInsurance() {
		System.out.println("invoked validInsurance");
		return false;
	}
    private String name="Abimbola";
    private String stateName="Nigeria";
    
    public void displayDetails() {
    	System.out.println("invoked displayDetails");
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
    

}
