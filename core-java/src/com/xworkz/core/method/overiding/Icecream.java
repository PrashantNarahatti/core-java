package com.xworkz.core.method.overiding;

public class Icecream {

	private String name;
	private IcecreamFlavour Flavour;
	private IcecreamType type;
	
	public Icecream() {
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
			if (obj instanceof Icecream) {
				System.out.println("Icecream is  an instance of Icecream ");
				Icecream a = (Icecream) obj;
				System.out.println("Casted");
				String storage = a.getName();
				if (this.name.equals(storage)) {
					System.out.println("name  have matched");
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

	public IcecreamFlavour getFlavour() {
		return Flavour;
	}

	public void setFlavour(IcecreamFlavour flavour) {
		Flavour = flavour;
	}

	public IcecreamType getType() {
		return type;
	}

	public void setType(IcecreamType type) {
		this.type = type;
	}
	
}
