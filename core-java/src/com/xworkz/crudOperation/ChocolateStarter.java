package com.xworkz.crudOperation;

public class ChocolateStarter {

	public static void main(String[] args) {
		
ChocolateOperator chocolateOperator=new ChocolateOperator();
		
		String sname=chocolateOperator.getName();
		System.out.println(sname);
		
		chocolateOperator.addChocoName("Amul");
		chocolateOperator.addChocoName("Galaxy");
		chocolateOperator.addChocoName("Bounty");
		chocolateOperator.addChocoName("Bar One");
		chocolateOperator.displayChocoNames();                        
		
		String sbrand=chocolateOperator.getBrand();
		System.out.println(sbrand);
		
		chocolateOperator.addChocoBrand("Kit Kat");		
		chocolateOperator.addChocoBrand("Cadbury");
		chocolateOperator.addChocoBrand("Nestle=");
		chocolateOperator.addChocoBrand("Milky Bar");
		chocolateOperator.displayChocobrands();

	}

}
