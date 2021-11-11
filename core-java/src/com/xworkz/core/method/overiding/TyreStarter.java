package com.xworkz.core.method.overiding;

public class TyreStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tyre tyre= new Tyre();
		Tyre tyre2 = new Tyre();
		
		System.out.println(tyre.toString());
		System.out.println(tyre.hashCode());

		tyre.setBrand("Apollo");
		tyre2.setBrand("CEAT");
		System.out.println(tyre.equals(tyre2));

	}

}
