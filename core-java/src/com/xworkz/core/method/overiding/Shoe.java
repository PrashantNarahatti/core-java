package com.xworkz.core.method.overiding;

public class Shoe {
	private String brand;
	private int size;
	private String colour;
	private char gender;
	
	public Shoe() {
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
			if (obj instanceof Shoe) {
				System.out.println("Shoe is  an instance of Shoe ");
				Shoe a = (Shoe) obj;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	

}
