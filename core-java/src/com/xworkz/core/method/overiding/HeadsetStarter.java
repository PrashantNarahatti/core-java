package com.xworkz.core.method.overiding;

public class HeadsetStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Headset headset= new Headset();
		Headset headset2 = new Headset();
		
		System.out.println(headset.toString());
		System.out.println(headset.hashCode());

		headset.setBrand("one plus");
		headset2.setBrand("Jabra");
		System.out.println(headset.equals(headset2));
		
		HeadsetType INEAR = null;
		headset.setType(INEAR);
		HeadsetType EARBUDS = null;
		headset2.setType(EARBUDS);
		System.out.println(headset.equals(headset2));

	}

}
