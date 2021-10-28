package com.xworkz.crudOperation;

public class ChocolateOperator {

	private String name;
	private String brand;
	private String[] chocoNames = new String[4];
	private String[] chocoBrands = new String[4];
	private int counter = 0;

	public ChocolateOperator() {

		System.out.println("invoked no-arg const");
	}

	public ChocolateOperator(String name, String brand) {
		this.name = name;
		this.brand = brand;
		System.out.println("invoked String and String const");
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public void addChocoName(String name) {
		System.out.println("invoked addChocoName");
		System.out.println("Name arg :".concat(name));
		if (this.counter < 4) {
			this.chocoNames[this.counter] = name;
			this.counter++;
		} else {
			System.out.println("array is full");
		}
	}

	public void addChocoBrand(String brand) {
				    System.out.println("invoked addChocoBrand");
					   System.out.println("Brand arg :". concat(brand));
					   if(this.counter<4) {
						   this.chocoBrands[this.counter]=brand;
						   this.counter++;
					   }
					   else {
						   System.out.println("array is full");
					   }
	}

	public void displayChocoNames() {
		System.out.println("invoked displayChocoNames");
		for (int kama = 0; kama < this.chocoNames.length; kama++) {
			String name = this.chocoNames[kama];
			System.out.println(name);
		
		}

	}
	public void displayChocobrands() {
		System.out.println("invoked displayChocobrands");
		for (int lambu = 0; lambu < this.chocoBrands.length; lambu++) {
			String brand = this.chocoBrands[lambu];
			System.out.println(brand);
		}
		}

}