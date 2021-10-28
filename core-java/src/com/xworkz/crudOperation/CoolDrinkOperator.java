package com.xworkz.crudOperation;

public class CoolDrinkOperator {
	private String[] brandName = new String[7];
	private int counter = 0;

	public void addBrandName(String brand) {
		System.out.println("invoked String arg");
		System.out.println("Name arg :".concat(brand));
		if (this.counter < 7) {
			this.brandName[this.counter] = brand;
			this.counter++;
		} else {
			System.err.println("array is full");
		}
	}

	public String[] getBrandName() {
		return brandName;
	}

	public void displayBrandName() {
		System.out.println("invoked displayBrandName");
		for (int chakli = 0; chakli < this.brandName.length; chakli++) {
			String name = this.brandName[chakli];
			System.out.println(name);

		}

	}

	public void deleteBrandName(String jamoon) {
		System.out.println("invoked delete arg");
		System.out.println("Name arg :".concat(jamoon));
		if (this.counter < this.brandName.length && this.counter >= 0) {
			this.brandName[this.counter] = null;

		}

		else {
			System.err.println("array is full");
		}
	}

	public void updateBrandName(String chocolate) {
		System.out.println("invoked update arg");
		System.out.println("Name arg :".concat(chocolate));
		if (this.counter < this.brandName.length && this.counter >= 0) {
			this.brandName[this.counter] = chocolate;
			this.counter++;
		}

		else {
			System.err.println("array is full");
		}
	}
}
