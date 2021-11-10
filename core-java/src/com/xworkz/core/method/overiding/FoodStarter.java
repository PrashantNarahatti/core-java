package com.xworkz.core.method.overiding;

public class FoodStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food= new Food();
		Food food2 = new Food();
		
		System.out.println(food.toString());
		System.out.println(food.hashCode());

		food.setName("Leather");
		food2.setName("Rubber");
		System.out.println(food.equals(food2));


	}

}
