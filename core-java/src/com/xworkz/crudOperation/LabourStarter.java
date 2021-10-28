package com.xworkz.crudOperation;

public class LabourStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabourOperator labourOperator = new LabourOperator();
		labourOperator.addName("Kusuma");
		labourOperator.addName("Shivanandh");
		labourOperator.addName("Umesh");
		labourOperator.addName("Raju");
		labourOperator.addName("Pranu");
		labourOperator.addName("Sallu K");
		labourOperator.addName("Somesh");
		labourOperator.displayName();

		String[] cname = labourOperator.getName();
		for (int name1 = 0; name1 < cname.length; name1++) {
			String name = cname[name1];
			System.out.println(name);

		}

		labourOperator.deleteName("Suresh");

		labourOperator.updateName("Mahatesh");
	}

}
