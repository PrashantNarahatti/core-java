package com.xworkz.crudOperation;

public class AirportStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirportOperator airOperator = new AirportOperator();
		airOperator.addName("Kempegowda");
		airOperator.addName("Indira Gandhi");
		airOperator.addName("Bagdogra");
		airOperator.addName("Cochin");
		airOperator.addName("Trivandrum");
		airOperator.addName("Lokpriya Gopinath");
		airOperator.addName("Amritsar");
		airOperator.displayName();

		String[] cname = airOperator.getName();
		for (int name1 = 0; name1 < cname.length; name1++) {
			String name = cname[name1];
			System.out.println(name);

		}

		airOperator.deleteName("Chennai International");

		airOperator.updateName("Pune");

	}

}
