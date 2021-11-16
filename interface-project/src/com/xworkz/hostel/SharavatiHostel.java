package com.xworkz.hostel;

public class SharavatiHostel implements HostelRule,VisitorDay {

	@Override
	public int inTime() {
		System.out.println("invoked inTime");
		return 10;
	}
	
	public int breakFastTime() {
		System.out.println("invoked breakFastTime");
		return 8;
	}

	@Override
	public String visitingDay() {
		// TODO Auto-generated method stub
		System.out.println("invoked visitingDay");
		return "SUNDAY";
	}

	

}
