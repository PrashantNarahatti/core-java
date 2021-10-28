package com.xworkz.crudOperation;

public class StadiumOperator {
	private String[] name = new String[7];
	private int counter = 0;

	public void addName(String name) {
		System.out.println("invoked String arg");
		System.out.println("Name arg :".concat(name));
		if (this.counter < 7) {
			this.name[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("array is full");
		}
	}

	public void displayName() {
		System.out.println("invoked displayName");
		for (int kama = 0; kama < this.name.length; kama++) {
			String name = this.name[kama];
			System.out.println(name);

		}

	}

	public void deleteName(String rice) {
		System.out.println("invoked delete arg");
		System.out.println("Name arg :".concat(rice));
		if (this.counter < this.name.length && this.counter >= 0) {
			this.name[this.counter] = rice;

		}

		else {
			System.err.println("array is full");
		}
	}

	public String[] getName() {
		return name;
	}

	public void updateName(String chocolate) {
		System.out.println("invoked update arg");
		System.out.println("Name arg :".concat(chocolate));
		if (this.counter < this.name.length && this.counter >= 0) {
			this.name[this.counter] = chocolate;

		}

		else {
			System.err.println("array is full");
		}
	}

}
