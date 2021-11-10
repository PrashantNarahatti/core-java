package com.xworkz.core.method.overiding;

public class ShoeStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoe shoe= new Shoe();
		Shoe shoe2 = new Shoe();
		
		System.out.println(shoe.toString());
		System.out.println(shoe.hashCode());

		shoe.setBrand("Nike");
		shoe.setBrand("Puma");
		System.out.println(shoe.equals(shoe2));

	}

}
