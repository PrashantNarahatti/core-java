package com.xworkz.appti;

public class Broadband {

	public static void main(String[] args) {
		String name = "Pacchu N";
		Broadband bb = new Broadband();
		bb.reverseEachChar(name);

	}

	void reverseEachChar(String name) {
		String reverse = " ";
		for (int index = name.length() - 1; index >= 0; index--) {
			// System.out.print(name.charAt(index));
			reverse = reverse + name.charAt(index);
		}
		System.out.println(reverse);
		System.out.println("\n" + name);

	}

}
