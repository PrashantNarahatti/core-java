package com.xworkz.core.method.overiding;

public class IcecreamStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icecream icecream= new Icecream();
		Icecream icecream2 = new Icecream();
		
		System.out.println(icecream.toString());
		System.out.println(icecream.hashCode());

		icecream.setName("Wildcraft 45");
		icecream2.setName("Roadster");
		System.out.println(icecream.equals(icecream2));
	}

}
