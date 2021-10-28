package com.xworkz.crudOperation;

public class StadiumStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StadiumOperator stadiumOperator = new StadiumOperator();
		stadiumOperator.addName("Kempegowda");
		stadiumOperator.addName("Indira Gandhi");
		stadiumOperator.addName("Bagdogra");
		stadiumOperator.addName("Cochin");
		stadiumOperator.addName("Trivandrum");
		stadiumOperator.addName("Lokpriya Gopinath");
		stadiumOperator.addName("Amritsar");
		stadiumOperator.displayName();

		String[] cname = stadiumOperator.getName();
		for (int name1 = 0; name1 < cname.length; name1++) {
			String name = cname[name1];
			System.out.println(name);

		}

		stadiumOperator.deleteName("Chennai International");

		stadiumOperator.updateName("Pune");
	}

}
