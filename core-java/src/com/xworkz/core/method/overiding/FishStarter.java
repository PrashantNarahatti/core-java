package com.xworkz.core.method.overiding;

public class FishStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish fish= new Fish();
		Fish fish2 = new Fish();
		
		System.out.println(fish.toString());
		System.out.println(fish.hashCode());

		fish.setName("Nemo");
		fish2.setName("Jack");
		System.out.println(fish.equals(fish2));
		
		FishType CATFISH = null;
		fish.setType(CATFISH);
		FishType SALMON = null;
		fish2.setType(SALMON);
		System.out.println(fish.equals(fish2));
	}

}
