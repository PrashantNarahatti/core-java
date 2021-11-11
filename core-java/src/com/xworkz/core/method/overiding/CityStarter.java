package com.xworkz.core.method.overiding;

public class CityStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City city= new City();
		City city2 = new City();
		
		System.out.println(city.toString());
		System.out.println(city.hashCode());

		city.setName("BGK");
		city2.setName("Gadag");
		System.out.println(city.equals(city2));

		city.setStateName("Karnataka");
		city2.setStateName("Karnataka");
		System.out.println(city.equals(city2));


	}

}
