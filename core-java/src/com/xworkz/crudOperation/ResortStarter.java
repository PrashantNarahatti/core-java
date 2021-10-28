package com.xworkz.crudOperation;

public class ResortStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resort resort=new Resort("Capital club");
		String name=resort.getName();
        System.out.println(name);
		
		
		resort.addName("Jacked resorts");
		resort.addName("Behinde wood");
		resort.addName("Eagliridg");
		resort.addName("SunShine resort");
		resort.addName("Ailaynna");
		resort.addName("Ailaynna");
		
		resort.displayResort();

	}

	}


