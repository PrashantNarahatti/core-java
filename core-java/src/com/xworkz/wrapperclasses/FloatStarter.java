package com.xworkz.wrapperclasses;

public class FloatStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Float phonePrice=18000.0f;
	     Float phonePrice1=18500.0f;
	     System.out.println(phonePrice1.SIZE);
	     
	     Float penCost=15.0f;
	     Float penCost1=18.0f;
	     int pen=penCost1.compareTo(penCost);
	     System.out.println(pen);
	     
	     
	     Float batSize=9.0f;
	     int ref=batSize.intValue();
	     System.out.println(ref);
	     
	     float penPrice=10.0f;
	     Float penPrice1=20.0f;
	      penPrice=penPrice1.hashCode();
	     System.out.println(penPrice);
	     
	     long bike=7l;
	     Float bike1=75000.0f;
	     long bikename=bike1.longValue();
	     System.out.println(bikename);
	}

}
