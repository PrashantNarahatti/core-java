package com.xworkz.core.method.overiding;

public class Tyre {
	
	private String brand;
	private TyreType type;
	private float price;
	
	public Tyre() {
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
			if (obj instanceof Tyre) {
				System.out.println("Tyre is  an instance of Tyre ");
				Tyre a = (Tyre) obj;
				System.out.println("Casted");
				String storage = a.getBrand();
				if (this.brand.equals(storage)) {
					System.out.println("brand have matched");
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

	public TyreType getType() {
		return type;
	}

	public void setType(TyreType type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
     

}
