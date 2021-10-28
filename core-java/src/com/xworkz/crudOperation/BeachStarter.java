package com.xworkz.crudOperation;

public class BeachStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeachOperator beachOperator=new BeachOperator();
		
		String cname=beachOperator.getCountry();
		System.out.println(cname);
		
		beachOperator.addBeachName("Om Beach");
		beachOperator.displayBeachNames();
		
		beachOperator.addBeachName("Baga Beach");
		beachOperator.displayBeachNames();
		beachOperator.addBeachName("RK Beach");
		beachOperator.addBeachName("NITK Beach");
		beachOperator.addBeachName("Panambur Beach");
		beachOperator.addBeachName("Karwar Beach");
		beachOperator.displayBeachNames();
		

	}

}
