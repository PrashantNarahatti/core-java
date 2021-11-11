package com.xworkz.core.method.overiding;

public class NewspaperStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Newspaper newspaper= new Newspaper();
		Newspaper newspaper2 = new Newspaper();
		
		System.out.println(newspaper.toString());
		System.out.println(newspaper.hashCode());

		newspaper.setName("Vijava vani");
		newspaper2.setName("Prajavani");
		System.out.println(newspaper.equals(newspaper2));

	}

}
