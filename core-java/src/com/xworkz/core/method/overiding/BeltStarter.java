package com.xworkz.core.method.overiding;

public class BeltStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Belt belt= new Belt();
		Belt belt2 = new Belt();
		
		System.out.println(belt.toString());
		System.out.println(belt.hashCode());

		belt.setMaterial("Leather");
		belt2.setMaterial("Rubber");
		System.out.println(belt.equals(belt2));

	}

}
