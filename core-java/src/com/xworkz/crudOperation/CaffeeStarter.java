package com.xworkz.crudOperation;

public class CaffeeStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeOperator coffeeOperator = new CoffeeOperator();
		coffeeOperator.addName("Affogato");
		coffeeOperator.addName("America No");
		coffeeOperator.addName("Cold");
		coffeeOperator.addName("hot");
		coffeeOperator.addName("Cafe latte");
		coffeeOperator.addName("Cappuccino");
		coffeeOperator.addName("Flat White");
		coffeeOperator.displayName();

		String[] cname = coffeeOperator.getName();
		for (int name1 = 0; name1 < cname.length; name1++) {
			String name = cname[name1];
			System.out.println(name);

		}

		coffeeOperator.deleteName("Macchiato");

		coffeeOperator.updateName("Double Espresso");

	}

}
