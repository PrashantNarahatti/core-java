package com.xworkz.core.method.overiding;

public class Aeroplane {
	
	private short aeroplaneNumber;
	private String company;
	private boolean govt;
	
	public Aeroplane() {
		System.out.println("Invoked no argument constructor");
	}

	@Override
	public String toString() {
		System.out.println("Invoked to String Method");
		return super.toString();
	};

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode method");
		return 100;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj == null) {
			System.out.println("You have passed null value");
				return false;
		}
			if (obj instanceof Aeroplane) {
				System.out.println("Aeroplane is  an instance of Aeroplane ");
				Aeroplane a = (Aeroplane) obj;
				System.out.println("Casted");
				String storage = a.getCompany();
				if (this.company.equals(storage)) {
					System.out.println("company have matched");
					return true;
				}

			}
			return false;
	}

	public short getAeroplaneNumber() {
		return aeroplaneNumber;
	}

	public void setAeroplaneNumber(short aeroplaneNumber) {
		this.aeroplaneNumber = aeroplaneNumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isGovt() {
		return govt;
	}

	public void setGovt(boolean govt) {
		this.govt = govt;
	}
	


}
