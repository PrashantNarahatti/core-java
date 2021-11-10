package com.xworkz.core.method.overiding;

public class Sock {
	private String name;
  private char size;
  private float price;
  private SockMaterial material;
  private SockType type; 
    

	public Sock() {
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
			if (obj instanceof Sock) {
				System.out.println("Sock is  an instance of Sock ");
				Sock a = (Sock) obj;
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

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public SockMaterial getMaterial() {
		return material;
	}

	public void setMaterial(SockMaterial material) {
		this.material = material;
	}

	public SockType getType() {
		return type;
	}

	public void setType(SockType type) {
		this.type = type;
	}

}
