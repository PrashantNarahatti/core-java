package com.xworkz.core.method.overiding;

public class AeroplaneStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeroplane aeroplane= new Aeroplane();
		Aeroplane aeroplane2 = new Aeroplane();
		
		System.out.println(aeroplane.toString());
		System.out.println(aeroplane.hashCode());

		aeroplane.setCompany("Delta airlines");
		aeroplane2.setCompany("Air France");
		System.out.println(aeroplane.equals(aeroplane2));
	}

}
