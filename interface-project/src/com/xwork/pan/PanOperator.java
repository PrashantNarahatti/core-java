package com.xwork.pan;


public class PanOperator {
	private String[] pan = new String[5];
	private int count = 0;

	public void save(String pan) throws ValidPanException,StorageFullRunTimeException {
		System.out.println("Invoked save method from Pan Operator");
		if (this.count < this.pan.length && pan != null) {
			this.pan[this.count++] = pan;
			if (pan.startsWith("Alphabet",5) && pan.endsWith("Alphabet")) {
				System.out.println("pan is Valid");

			} else {
				System.err.println("pan is Invalid");
				throw new ValidPanException();
			}
		} else {
			System.err.println("pan is equal to null");
			throw new StorageFullRunTimeException();

		}


	}
}
