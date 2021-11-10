package com.xworkz.deepavali;
import com.xworkz.deepavali.Constants.PoliceDept;


public class Police {
	
	public String name;
	protected String designation;
	protected float exp;
	protected PoliceDept dept;
	protected int noOfStars;
	
	protected Police() {
		super();
		System.out.println("invoked no arg const of police");
	}

	protected void displayDetails() {
		System.out.println("invoked displayDetails from police");
	}
}
