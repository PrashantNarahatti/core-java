package com.xworkz.diamond;

import com.xworkz.diamond.shop.Joyalukas;

public class DiamondStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mine mine=new Mine();
		System.out.println(mine);
		
		String location=mine.getLocation();
		System.out.println(location);
		
		mine.setLocation("BGK");
		String location1=mine.getLocation();
		System.out.println(location1);
		
		Joyalukas joyalukas=new Joyalukas();
		System.out.println(joyalukas);
		
		String ownerName=joyalukas.getOwnerName();
		System.out.println(ownerName);
		
		
		Branch branch=new Branch();
		System.out.println(branch);

		
		
	}

}
