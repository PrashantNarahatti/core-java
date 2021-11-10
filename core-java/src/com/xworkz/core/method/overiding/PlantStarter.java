package com.xworkz.core.method.overiding;

public class PlantStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant= new Plant();
		Plant plant2 = new Plant();
		
		System.out.println(plant.toString());
		System.out.println(plant.hashCode());

		plant.setName("corn");
		plant2.setName("palm");
		System.out.println(plant.equals(plant2));
		
		PlantType FRUITS = null;
		plant.setType(FRUITS);
		PlantType FLOWERS = null;
		plant2.setType(FLOWERS);
		System.out.println(plant.equals(plant2));
	}

}
