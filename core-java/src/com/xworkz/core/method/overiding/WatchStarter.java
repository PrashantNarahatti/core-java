package com.xworkz.core.method.overiding;

public class WatchStarter {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Watch watch= new Watch();
		 Watch watch2 = new Watch();
		
		System.out.println(watch.toString());
		System.out.println(watch.hashCode());

		watch.setBrand("Realme 6S");
		watch2.setBrand("Fastrack");
		System.out.println(watch.equals(watch2));
		
		WatchType DIVINGWATCH = null;
		watch.setType(DIVINGWATCH);
		WatchType SMARTWATCH = null;
		watch2.setType(SMARTWATCH);
		System.out.println(watch.equals(watch2));


	}

}
