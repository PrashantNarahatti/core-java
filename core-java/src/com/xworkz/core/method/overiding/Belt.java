package com.xworkz.core.method.overiding;

public class Belt {
 private float price;
 private String material;
 private int size;
 private char gender;
 
 public Belt() {
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
			if (obj instanceof Belt) {
				System.out.println("Belt is  an instance of Belt ");
				Belt a = (Belt) obj;
				System.out.println("Casted");
				String storage = a.getMaterial();
				if (this.material.equals(storage)) {
					System.out.println("material have matched");
					return true;
				}

			}
			return false;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	

}
