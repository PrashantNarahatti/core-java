package com.xworkz.core.method.overiding;

public class Food {
	private String name;
	private float price;
	private String quality;
	
	public Food() {
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
			if (obj instanceof Food) {
				System.out.println("Food is  an instance of Food ");
				Food a = (Food) obj;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}


}
