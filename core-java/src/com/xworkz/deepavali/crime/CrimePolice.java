package com.xworkz.deepavali.crime;
import com.xworkz.deepavali.Police;
public class CrimePolice extends Police {
	
	public CrimePolice() {
		super();
		System.out.println("invoked no arg of CrimePolice");
		System.out.println(super.name);
		System.out.println(super.exp);
		
	}
public void testMethod() {
	System.out.println("invoked testMEethod from CrimePolice");
	super.displayDetails();
}
}
