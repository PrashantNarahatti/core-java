package com.xworkz.core.method.overiding;

public class StadiumStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stadium stadium= new Stadium();
		Stadium stadium2 = new Stadium();
		
		System.out.println(stadium.toString());
		System.out.println(stadium.hashCode());

		stadium.setName("KSR");
		stadium2.setName("SRP");
		System.out.println(stadium.equals(stadium2));

	}

}
