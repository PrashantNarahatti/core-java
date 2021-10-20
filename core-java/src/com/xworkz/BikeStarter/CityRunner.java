package com.xworkz.BikeStarter;

public class CityRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String brand="Hero";
     brand=brand.concat("Pacchu Travelled ,to meet sister ");
     System.out.println(brand);
     
     String max=null;
     System.out.println(max);
     
     String name="Xwork";
		boolean contain=name.contains("no");
		System.out.println("contains wo"+contain);
		
		char[] chars= {'B','A','G','A','L','K','O','T'};
		String convertedString=String.copyValueOf(chars);
		System.out.println(convertedString);
		
		String place="BGK";
		String famousFor="Durga Temple";
		String bgkFamousFor=place.concat(famousFor);
		System.out.println(bgkFamousFor);
	}

}
