package com.xworkz.core.method.overiding;

public class Plant {
	private String name;
	private boolean alive;
	private String lifeSpan;
	private PlantType type;
	
	public Plant() {
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
			if (obj instanceof Plant) {
				System.out.println("Plant is  an instance of Plant ");
				Plant a = (Plant) obj;
				System.out.println("Casted");
				String storage = a.getName();
				if (this.name.equals(storage)) {
					System.out.println(" name have matched");
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

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public String getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(String lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public PlantType getType() {
		return type;
	}

	public void setType(PlantType type) {
		this.type = type;
	}
	


}
