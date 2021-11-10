package com.xworkz.core.method.overiding;

public class Headset {
	private String brand;
	private HeadsetType type;
	private boolean battery;
	private String warranty;
	
	public Headset() {
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
			if (obj instanceof Headset) {
				System.out.println("Headset is  an instance of Headset ");
				Headset a = (Headset) obj;
				System.out.println("Casted");
				String storage = a.getBrand();
				if (this.brand.equals(storage)) {
					System.out.println("brand  have matched");
					return true;
				}

			}
			return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public HeadsetType getType() {
		return type;
	}

	public void setType(HeadsetType type) {
		this.type = type;
	}

	public boolean isBattery() {
		return battery;
	}

	public void setBattery(boolean battery) {
		this.battery = battery;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	


}
