package com.xworkz.core.method.overiding;

public class Stadium {
	
	private String name;
	private String city;
	private float areaInMeters;
	    
	public Stadium() {
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
			if (obj instanceof Stadium) {
				System.out.println("Stadium is  an instance of Stadium ");
				Stadium a = (Stadium) obj;
				System.out.println("Casted");
				String storage = a.getName();
				if (this.name.equals(storage)) {
					System.out.println("name have matched");
					return true;
				}

			}
			return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getAreaInMeters() {
		return areaInMeters;
	}

	public void setAreaInMeters(float areaInMeters) {
		this.areaInMeters = areaInMeters;
	}


}
