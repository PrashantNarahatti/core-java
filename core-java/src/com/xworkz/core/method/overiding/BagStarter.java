package com.xworkz.core.method.overiding;

public class BagStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag bag= new Bag();
		Bag bag2 = new Bag();
		
		System.out.println(bag.toString());
		System.out.println(bag.hashCode());

		bag.setBrand("Wildcraft 45");
		bag2.setBrand("Roadster");
		System.out.println(bag.equals(bag2));
		
		BagColor GREEN = null;
		bag.setColor(GREEN);
		BagColor RED = null;
		bag2.setColor(RED);
		System.out.println(bag.equals(bag2));

	}

}
